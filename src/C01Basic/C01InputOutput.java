package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
//        출력 : System.out
//        System.out.println(20); //sout 단축어 사용가능
//        System.out.print("Hello World 1"); //print는 줄바꿈 없는 출력
//        System.out.println("Hello World 2");

//        입력 : System.in(키보드 입력) + Scanner(입력을 위한 클래스) 활용
//        Scanner myScanner = new Scanner(System.in); //스캐너 객체를 myScanner 변수에 할당
////        nextLine() : 입력받은 데이터를 한줄로 읽어서, String으로 리턴
//        String inputLine = myScanner.nextLine();
//        System.out.println("입력사항 : " + inputLine);

//        예를 들어 아래와 같은 입력값이 주어질 때 처리방벙
        /*
        abc
        bcd
        2
         */
//        Scanner myScanner = new Scanner(System.in);
//        String inputLine1 = myScanner.nextLine();
//        String inputLine2 = myScanner.nextLine();
//        int count = myScanner.nextInt();
//        System.out.println("입력사항 : " + inputLine1);
//        System.out.println("입력사항 : " + inputLine2);
//        System.out.println("입력사항 : " + count);

////        입력 : System.in + BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input1 = br.readLine();
//        System.out.println(input1);
//
//        String[] input2 = br.readLine().split(" ");
//        System.out.println(input2[0]);
//        System.out.println(input2[1]);
//        System.out.println(input2[2]);

        String input3 = br.readLine();
//        StringTokenizer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 담음
        StringTokenizer st = new StringTokenizer(input3);
        System.out.println(st);

    }
}
