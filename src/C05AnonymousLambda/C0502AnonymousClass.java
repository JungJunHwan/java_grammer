package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명의 클래스가 만들어짐과 동시에 익명객체가 생성되고 있음
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {}
        };

//        Animal1의 익명객체 성성
        Animal1 ai1 = new Animal1() {
            @Override
            public void makeSound() {
                System.out.println("동물은 소리를 냅니다 1");
            }
        };
        ai1.makeSound();

//        익명객체에 구현메서드가 1개밖에 없을때에는 람다표현식(화살표 함수)으로 표현 가능
//        ()부분에 매개변수가 지정
//        Animal1 ai2 = () -> System.out.println("동물은 소리를 냅니다 2");
//        실행문이 2줄 이상인 경우에 아래와 같이 {}로 감싸야 함에 유의
        Animal1 ai2 = () -> {
            System.out.println("동물은 소리를 냅니다 2");
            System.out.println("동물은 소리를 냅니다 2");
            System.out.println("동물은 소리를 냅니다 2");
        };
        ai2.makeSound();

//        매게변수를 받아 String으로 리턴하는 메서드를 구현한 익명객체 생성
        Animal2 animal2 = (a, b, c) -> {
            return a + " " + b + " " + c;
        };

        System.out.println(animal2.makeSound("hello","world","java"));

//        실습 : Animal3 인터페이스 정의. makeSound 함수(매개변수는 String, String, int) 리턴 타입은 String
//        구현체의 기능은, a,b,c 증에 c가 10 이상이면 a+b를 리턴, c가 10보다 작으면 a를 리턴
        Animal3 animal3 = (a,b,c) -> {
            if(c >= 10) return a+b;
            else return a;
        };
        System.out.println(animal3.makeSound("hello", " world", 10));

    }
}

abstract class AbstractAnimal{
    abstract void makeSound1();
    void makeSound2(){

    }
}

interface Animal1{
    void makeSound();
}

interface Animal2{
    String makeSound(String a, String b, String c);
}

interface Animal3{
    String makeSound(String a, String b, int c);
}