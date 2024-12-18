package C03Inheritance;

//실습 : 부모 클래스(SuperParents)에 객체 변수 a 선언 후 10할당
//부모 클래스에 객체 메서드 display 안에 "부모 클래스입니다" 출력
//자식 클래스에서 부모 클래스의 변수 a 출력, 부모 클래스의 display 호출
public class C0302SuperKeyword extends SuperParents{
    int a;
    C0302SuperKeyword(){
//        super() : 부모 클래스의 생성자를 의미
        super(10);
        a=20;
    }
    public static void main(String[] args) {
        C0302SuperKeyword sk = new C0302SuperKeyword();
//        sk.display();
//        System.out.println(sk.a);
        sk.display2();
    }
    void display2(){
        System.out.println(a);
        System.out.println(super.a);
    }
}

class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
    SuperParents(){

    }
    void display(){
        System.out.println("부모 클래스입니다");
        System.out.println(this.a);
    }
}
