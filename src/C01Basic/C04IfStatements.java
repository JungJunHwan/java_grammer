package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
////        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(answer == input){
//            System.out.println("문이 열렸습니다.");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다");
//        }

////        버스카드 예제
//        System.out.println("현재 잔액은 얼마인가요?");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
////        if, else if 구문에서 조건식은 택1로서, 한 조건에 해당하면 실행 후 전체 구문 밖으로 나감
////        if 문이 독립적으로 존재할 경우에는 적확한 범위 지정을 하지 않으면
////        모든 if문이 중복되어 실행될 가능성이 존재
//        if(myMoney >= 10000){
//            System.out.println("택시를 타시오");
//        }else if (myMoney >= 3000) {
//            System.out.println("버스를 타시오");
//        }else if (myMoney >= 2000) {
//            System.out.println("킥보드를 타시오");
//        }else{
//            System.out.println("걸어가시오");
//        }

////        삼항연산자 -> 결과값 = 조건식 ? 반환값 1 : 반환값2
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        String result = input == answer ? "문이 열렸습니다." : "비밀번호가 틀렸습니다";
//        System.out.println(result);

//        swotch문 : if, else if 등의 조건문을 가독성있게 표현 구문
//        예제) if문 : 서비스 번호 입력 받은 후 1이면 "대출업무입니다" 2이면 "예금업무입니다"
//        3이면 "적금업무입니다", 0이면 "상담사연결입니다"
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
//        if(input == 1){
//            System.out.println("대출업무입니다");
//        } else if(input == 2) {
//            System.out.println("예금업무입니다");
//        }else if(input == 3){
//            System.out.println("적금업무입니다");
//        }else if(input == 0){
//            System.out.println("상담사연결입니다");
//        }
//        switch문으로 구현
        switch (input){
            case 1 :
                System.out.println("대출업무입니다");
                break;
            case 2 :
                System.out.println("예금업무입니다");
                break;
            case 3 :
                System.out.println("적금업무입니다");
                break;
            case 0 :
                System.out.println("상담사연결입니다");
                break;
            default :
                System.out.println("잘못된 입력입니다.");
                break;
        }


    }
}
