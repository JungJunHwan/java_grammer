package C06EtcClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {
//        String[] stArr = {"java", "python", "C"};
//        stChange(stArr, 0, 1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr = {10,20,30};
//        integerChange(intArr, 0, 1);
//        System.out.println(Arrays.toString(intArr));
//
//        genericChange(stArr, 1, 2);
//        genericChange(intArr, 1, 2);
//        System.out.println(Arrays.toString(stArr));
////        generic을 사용한 메서드 활용
//        System.out.println(Arrays.toString(intArr));

        GenericPerson p1 = new GenericPerson("hong");
        System.out.println(p1.getValue());

//        generic을 사용하여 범용적 클래스(객체) 생성
        GenericPerson<Integer> p2 = new GenericPerson<>(10);
        System.out.println(p2.getValue());

//        제네릭의 사용 예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        IntStream intStream;
        Optional<String> optional;
        OptionalInt optionalInt;

    }

//    generic 메서드는 반환 타입 왼쪽에 <T> 선언
//    유의점으로 T에는 참조형 변수인 객체 타입이 들어와야함
    static <T> void genericChange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void stChange(String[] stArr, int a, int b){
        String temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    static void integerChange(Integer[] arr, int a, int b){
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//generic 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class Person{
    private String value;

    public Person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}