package C02ClassBasic;

public class C0207FunctionCall {
    public static void main(String[] args) {
        System.out.println("main 함수 시작");
        function1();
        System.out.println("main 함수 끝");
    }

    public static void function1(){
        System.out.println("f1 시작");
//        함수가 자기 자신을 호출하는 함수일 경우 이를 재귀함수라 부른다
//        재귀함수에 종료 로직이 없는 경우 스택 멤모리에 함수가 무한히 쌓여 스택오버플로우 에러가 발생
        function1();
        System.out.println("f1 종료");
    }

    public static void function2(){
        System.out.println("f2 시작");
        System.out.println("f2 종료");
    }
}
