package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0904DbWebserver {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";
        String helloWorld = "Hello!";

        Connection connection = DriverManager.getConnection(url, userName, password);

        ServerSocket serverSocket = new ServerSocket(8080);
        Statement st = connection.createStatement();

        System.out.println("서버 시작");
        while(true) {
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null && !line.isEmpty()) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }

            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            int postId = 0;
            String postTitle = "";
            String postContents = "";
            String output = "";

            if (infos.contains("?")) {
                id = infos.split("=")[1];
                ResultSet rs = st.executeQuery("select * from post where id=" + id);
                while(rs.next()) {
                    postId = rs.getInt("id");
                    postTitle = rs.getString("title");
                    postContents= rs.getString("contents");
                    output = "id : " + postId + "\ntitle : " + postTitle + "\ncontents : " + postContents;
                }
            }

            String response = "HTTP/1.1 200 OKay\r\n\r\n" + helloWorld + output;
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
            helloWorld = "";
        }
    }
}
