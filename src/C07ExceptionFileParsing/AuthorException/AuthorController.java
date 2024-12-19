package C07ExceptionFileParsing.AuthorException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 레이어
public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while(true){
            System.out.println("회원가입 1번, 로그인 2번, 회원목록조회 3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if(input.equals("1")){ //회원가입
                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("email을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("password를 입력해주세요");
                String password = sc.nextLine();
//                email 중복 방지, password 길이 8자리 이상이어야 함
//                try, catch 컨트롤러에서 구현
                try{
                    authorService.register(name, email, password);
                    System.out.println("회원가입에 성공했습니다");
                }catch (IllegalArgumentException error){
                    System.out.println("이미 존재하는 회원입니다");
                }catch (InputMismatchException error){
                    System.out.println("비밀번호를 8자리 이상 입력해주세요");
                }
            }

            else if(input.equals("2")){ //로그인
                System.out.println("email을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("password를 입력해주세요");
                String password = sc.nextLine();
//                email과 password가 맞는지 검증
//                try, catch 컨트롤러에서 구현
                try{
                    authorService.login(email, password);
                    System.out.println("로그인에 성공했습니다");
                }catch (InputMismatchException error){
                    System.out.println("비밀번호가 틀렸습니다");
                }catch (NoSuchElementException error){
                    System.out.println("존재하지 않는 회원입니다");
                }
            }

            else if(input.equals("3")){ //회원 목록 조회
//                전체 목록을 서비스로부터 받아와서 출력
                for(Author a :authorService.findAll()){
                    System.out.println(a);
                }
            }
        }
    }
}
