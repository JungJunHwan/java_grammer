package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1~10까지 누적 합계
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            count += i;
        }
        System.out.println(count);
//        재귀함수로 1~10까지 누적합계
        System.out.println(sumAcc(10));

//        factorial 값 구하기
        System.out.println(factorial(5));

//        피보나치 수열 구현 a(n) = a(n-1) + a(n-2)
//        1 1 2 3 5 8 13
//        for문으로 구현
        int a = 1;
        int b = 1;
        int n = 0;
        for (int i = 0; i < 10 - 1; i++) {
            n = a+b;
            a=b;
            b=n;
        }
        System.out.println(n);
//        재귀 함수로 구현
        System.out.println(fibonacci(10));
    }

    public static int factorial(int n){
        if(n == 2) return 2;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sumAcc(int n){
        if(n==1) return 1;
        return n + sumAcc(n-1);
    }
}
