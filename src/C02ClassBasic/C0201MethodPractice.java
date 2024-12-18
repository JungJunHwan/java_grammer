package C02ClassBasic;
//만약 소수 판별기
public class C0201MethodPractice {
    public static void main(String[] args) {
        if (isPrime(11)){
            System.out.println("소수입니다");
        }else {
            System.out.println("소수가 아닙니다");
        }

    }
    public static boolean isPrime(int a){
        for (int i =2; i< a; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
}
