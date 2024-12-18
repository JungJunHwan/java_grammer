package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
////        전통적인 데이터 접근 방식 : 메모리 주소 접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for(int a : arr){
//            System.out.println(a);
//        }
//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        자바에서 함수형 프로그래밍을 지원하기 위한 라이브러리는 streamAPI
//        foreach는 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
////        스트림의 생성 : .stream()
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        Stream<String> stream1 = Arrays.stream(stArr);
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        Stream<String> stream2 = myList.stream();
//
//        int[] intArr = {10,20,30,40,50};
////        원시자료형을 가지고 stream 객체를 만들게 되면, Stream<타입>이 아니라, 별도의 Stream 객체 존재
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        Stream<Integer> stream4 = myList2.stream();

////        stream 변환(중개연산) : filter, map, sorted, distinct
//        int[] intArr = {10,10,30,40,50};
////        filter : 특정 기준으로 대상을 filtering 한 뒤에 새로운 스트림 반환
////        아래 코드는 filter 까지 중개연산이고, sum을 통해 스트림을 모두 소모하여 종합을 구함
//        int sum = Arrays.stream(intArr).filter(a -> a<=30).sum();
////        원시자료형의 경우 IntStream으로 stream객체가 반환되므로, 제네릭타입소거 문제 발생하지 않음
//        int[] newIntArr = Arrays.stream(intArr).filter(a -> a<=30).toArray();
//        System.out.println(sum);
//        System.out.println(Arrays.toString(newIntArr));
//
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        제네릭 타입소거로 인해, .toArray를 통해 바로 새로운 String 배열을 만드는 것이 불가
////        제네릭 타입소거란 <String> 이러한 제네릭의 타입이 런타임 시점에서는 제거되는 것을 의미
////        String[] newStArr = (String[])Arrays.stream(stArr).filter(a -> a.length() <= 4).toArray(); //이 방법은 출력이 안되므로 사용 X
//        String[] newStArr = Arrays.stream(stArr).filter(a -> a.length() <= 4).toArray(a -> new String[a]); //a 변수에는 배열의 길이가 담김
//        System.out.println(Arrays.toString(newStArr));

////        distinct : 중복제거
//        int[] intArr = {10,10,30,40,50};
//        int[] newArr = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newArr));
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[]newArr2 = Arrays.stream(intArr).map(a -> a*10).toArray();
//        System.out.println(Arrays.toString(newArr2));
//
////        mapToInt : intstream 형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        int sum = Arrays.stream(stArr).mapToInt(a -> a.length()).sum();
//        System.out.println(sum);
//        int[] newIntArr = Arrays.stream(stArr).mapToInt(a -> a.length()).toArray();
//        System.out.println(Arrays.toString(newIntArr));
//
////        sorted : 정렬된 새로운 스트림 반환
//        String[] newStArr = Arrays.stream(stArr).sorted(Comparator.reverseOrder()).toArray(a -> new String[a]);
//        System.out.println(Arrays.toString(newStArr));

//        int[] arr1 = {1,2,3,4,5,6};
////        arr1에서 홀수만 담은 배열을 arr2라는 이름으로 변환
//        int[] arr2 = Arrays.stream(arr1).filter(a -> a%2 != 0).toArray();
////        arr3에 홀수만 걸러서 해당 홀수의 제곱값을 담기
//        int[] arr3 = Arrays.stream(arr2).map(a -> (int)Math.pow(a,2)).toArray();
////        arr4에 홀수만 거르고, 제곱값을 구하고, 해당 숫자들을 오름차순한 순서로 담기
//        int[] arr4 = Arrays.stream(arr3).sorted().toArray();
//
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));

////        스트림의 소모 : foreach(출력), sum(합계), reduce(누적연산)
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a -> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();
////        optional 객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count();
////        reduce : 누적연산, reduce(초기값, 연산식)
////        아래 코드는 a의 초기값이 0이고 a에 b(배열에서 꺼내온 값)를 더해준 것
//        int allAdd = Arrays.stream(intArr).reduce(0, (a,b) -> a + b);
//        System.out.println(allAdd);
//        int allMultiply = Arrays.stream(intArr).reduce(1, (a,b) -> a * b);
//        System.out.println(allMultiply);
//        String[] stArr = {"hello", "java", "world"};
//        String myString = Arrays.stream(stArr).reduce("", (a,b) -> a + b + " ");
//        System.out.println(myString.strip());
////        findFirst : 첫번째 요소 반환
//        String first = Arrays.stream(stArr).filter(a -> a.length() >= 5).findFirst().get();
//        System.out.println(first);

////        stream 실습
//        List<Student> students = new ArrayList<>();
////        객체 4개 담기 : {"kim", 20}, {"choi", 32}, {"lee", 35}, {"park", 22}
//        students.add(new Student("kim", 20));
//        students.add(new Student("choi", 32));
//        students.add(new Student("lee", 35));
//        students.add(new Student("park", 42));
////        1) 모든 객체의 평균 나이
//        double averageAge = students.stream().mapToInt(Student::getAge).average().getAsDouble();
//        System.out.println(averageAge);
////        2)가장 나이 어린 사람 찾기
//        Student young = students.stream().sorted((a,b) -> a.getAge() - b.getAge()).findFirst().get();
//        System.out.println(young);
////        3)30대인 사람들의 이름만 새로운 String 배열에 담기
//        String[] thirty = students.stream().filter(a -> a.getAge()/10 == 3).map(a -> a.getName()).toArray(a -> new String[a]);
//        System.out.println(Arrays.toString(thirty));

//        메소드참조 :하나의 메소드만을 호출하는 경우에 매개변수를 제거한 형식, 클래스명::메서드명
//        students.stream().forEach(System.out::println);
//        String[] arr = students.stream().map(Student::getName).toArray(String[]::new);

////        Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        Optional<String> opt1 = Optional.ofNullable("hello");
//        String st1 = null;
//        if(st1 != null) System.out.println(st1.compareTo("hello"));
//        else System.out.println("값이 없습니다");
//        if(opt1.isPresent()) System.out.println(opt1.get().compareTo("hello"));
//        else System.out.println("값이 없습니다");

////        Optional 객체 생성 방법 3가지
//        Optional<String> opt1 = Optional.empty(); //비어있는 Optional 객체 생성
//        Optional<String> opt2 = Optional.ofNullable(null); //비어있는 Optional 객체 생성
//        Optional<String> opt2_1 = Optional.ofNullable("hello"); //값이 있는 Optional 객체 생성
//        Optional<String> opt3 = Optional.of("hello"); //값이 있는 경우만 Optional.of로 생성 가능
//
////        (중요) Optional 객체 처리 방법 4가지
////        방법1. isPresent() 확인 후 get()
//        if(opt2.isPresent()) System.out.println(opt3.get());
//        else System.out.println("값이 없습니다");
////        방법2. orElse() : 값이 있으면 있는값 return, 없으면 지정된 값 리턴
//        System.out.println(opt2.orElse("none"));
////        방법3. orElseGet() : 값이 있으면 있는 값 리턴, 없으면 람다함수 실행
//        System.out.println(opt2.orElseGet(() -> new String("none")));
////        방법4(가장 많이 사용). orElseThrow : 값이 있으면 있는 값 리턴, 없으면 지정된 예외 강제 발생
////        개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드 중단을 위해 강제로 예외를 발생시키는 경우가 많음
//        System.out.println(opt2.orElseThrow(() -> new NoSuchElementException("값이 없습니다")));

////        예시 1.
//        List<Student> students = new ArrayList<>();
//        OptionalDouble opt_avg = students.stream().mapToInt(a->a.getAge()).average();
//        if(opt_avg.isPresent()) System.out.println(opt_avg.getAsDouble());
//        else{
//            throw new NoSuchElementException("값이 없습니다");
//        }
////        위 코드를 아래의 한줄로 처리 가능
//        System.out.println(students.stream().mapToInt(a->a.getAge()).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다")));

//        예시 2. DB 조회 상황 가정
        System.out.println("조회하실 id를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        Optional<Student> myStudent;
        if(id<10) myStudent = Optional.of(new Student("홍길동", 20));
        else myStudent = Optional.empty();
//        Student가 있으면 student출력, 없으면 "해당학생은 없습니다"라고 에러메시지와 함께 에러 강제 발생
        System.out.println(myStudent.orElseThrow(() -> new NoSuchElementException("해당 학생은 없습니다")).toString());

    }
}
