package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10,20));

//        A부서의 매출
//        20원 매출
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);

//        30원 매출
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);

//        40원 매출
//        MyCalculator.sumAcc(40);
//        System.out.println(MyCalculator.total);

//        B부서의 매출
//        10원 매출
//        MyCalculator.total = 0;
//        MyCalculator.sumAcc(10);
//        20원 매출
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);

//        객체를 사용한 회계프로그램 : 객체 고유의 메모리 공간 할당
//        MyCalculatorInstance m1 = new MyCalculatorInstance();
//        MyCalculatorInstance.total_count += 1;
//        m1.sumAcc(10);
//        m1.sumAcc(20);
//        System.out.println(m1.total);
//        MyCalculatorInstance m2 = new MyCalculatorInstance();
//        MyCalculatorInstance.total_count += 1;
//        m2.sumAcc(30);
//        m2.sumAcc(40);
//        System.out.println(m2.total);
//        C0203Person person = new C0203Person();
//        person.eating("leejeaseok");

//        C0202Person person1 = new C0202Person();
//        person1.setName("hongildong");
//        person1.setAge(10);
//        person1.setEmail("jeaseok98@naver.com");
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//        System.out.println(person1.getEmail());
    }


}

class MyCalculator{
    static int total = 0;
    //    static이 붙으면 클래스 변수
//    static이 붙어있지 않으면 객체 변수
    static int sum(int a, int b){
        return a+b;
    }
    static void sumAcc(int a){
        total += a;
    }
}

class MyCalculatorInstance{
    static int total_count =0;
    int total = 0;
    //    static이 붙으면 클래스 변수
//    static이 붙어있지 않으면 객체 변수
    void sumAcc(int a){
//        this는 객체 그 자신을 의미
//        예를들어 m1객체일 경우, m1.total, m2객체일 경우 m2.total
//        일반적으로, 매개변수와 객체변수를 구분짓기 위해 사용해야함 (생략가능 - 매개변수와 이름이 같지 않을 경우)
        this.total += a;
    }
}
