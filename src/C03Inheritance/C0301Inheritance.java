package C03Inheritance;

//extends 키워드를 통해 상속을 수행
public class C0301Inheritance extends Parents{
    int c = 10;
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        변수 상속
        System.out.println(c1.a);
        System.out.println(c1.c);
//        private 변수, 메서드는 자식 클래스에서 접근 불가
//        System.out.println(c1.b);
//        메서드 상속
        c1.m1();
        c1.m2();
    }
//    부모 메서드의 재정의 : overriding
//    @Override : override임을 명시적으로 표현하는 표현식. 성능을 위해서 붙여주는게 더 좋은 것으로 알려져 있음
//    @Override
//    void m1(){
//        System.out.println("자식 클래스 입니다");
//    }
    void m2(){
        System.out.println("클래스 2 입니다");
    }
}

class Parents{
    int a = 10;
    private int b = 20;
    void m1(){
        System.out.println("클래스 입니다");
        System.out.println(b);
    }
}
