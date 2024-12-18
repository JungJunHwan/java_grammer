package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
////        참조자료형 : 기본자료형을 제외한 모든 자료형, 클래스 기반
////        wrapperClass : 기본형 타입을 Wrapping한 클래스 -> 다양한 메서드 사용 가능
//        int a = 10;
//        Integer b = new Integer(10);
////        오토 언박싱 : WrapperClass -> 기본자료형 형변환
//        int c = b;
////        오토 박싱 -> 기본자료형 -> WrapperClass 형변환
//        Integer d = a;

////        String과 int의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//
////        String -> int
//        int b = Integer.parseInt(st1);
//
////        배열에는 원시타입 자료형 세팅
//        int[] arr1 = {10, 20, 30};
//
////        리스트에는 참조자료형 세팅
////        참조자료형에 원시자료형을 담을떄는 WrapperClass를 써야함
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);


//        String st1 = new String("Hello 1");
////        리터럴 방식 허용 : 권장되는 방식(문자 pool을 통해 성능향상)
//        String st2 = "Hello 1";
//        String st3 = "Hello 1";
////        참조자료형이므로 == 비교는 메모리 주소가 되고, 값을 비교할때는 .equals 사용
//        System.out.println(st2==st3);
//
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);

//        equalsIgnoreCase : 대소문자 무시
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "HELLo1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));

////        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
////        charAt : 특정 index의 문자(char)값을 리턴
//        int count = 0;
//        for (int i = 0; i < st1.length(); i++) {
//            if(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z'){
//                count++;
//            }
//        }
//        System.out.println(count);

////        a의 개수가 몇개인지 출력
//        String st2 = "abcdefabaadf";
//        int count = 0;
//        for (int i = 0; i < st2.length(); i++) {
//            if(st2.charAt(i) == 'a') count++;
//        }
//        System.out.println(count);

////        toCharArray : String 문자열을 char 배열로 리턴
//        String st3 = "abcdefabaadf";
//        int count = 0;
//        for (char ch : st3.toCharArray()) {
//            if(ch == 'a') count++;
//        }
//        System.out.println(count);

////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 리턴
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//
////        contains : 특정 문자열이 있는지 여부 (boolean)
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

////        문자열 더하기 " +=
//        String st1 = "hello";
//        st1 += "world";
//
////        프로그래머스 : 특정 문자 제거하기

////        substring(a,b) : a이상 b미만의 index의 문자를 잘라 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));
//
////        프로그래머스 : 가운데 글자 가져오기

////        trim, strip : 문자열 양쪽 끝의 공백 제거, strip 쓰는걸 추천
//        String st1 = " hello world       ";
//        String trimSt1 = st1.trim();
//        String stripSt1 = st1.strip();
//        System.out.println(trimSt1);
//        System.out.println(stripSt1);

////        topUpperCase : 대문자로 변환, toLowerCase : 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);

////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
////        String -> char 형변환
//        char ch2 = st1.charAt(0);
//        char[] ch3 = st1.toCharArray();

////        replace(a,b) : a 문자열을 b 문자열로 대체
//        String st1 = "hello world";
//        String st2 =  st1.replace("world", "java");
//        System.out.println(st2);

////        replaceAll(a,b) : replace와 동일 : 정규표현식을 쓸 수 있는점이 차이
//        String st1 = "01abc123한글123ABC";
////        for문 사용해서 소문자 알파벳만 제거한 새로운 문자열 생성
//        String answer = "";
//        char[] arr = st1.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if(!(arr[i] >= 'a' && arr[i] <= 'z')) answer += arr[i];
//        }
//        System.out.println(answer);
//
////        [a-z]+ : 1개 이상의 소문자 알파벳 의미
////        [A-Za-z]+ : 대소문자 포함한 알파벳
////        [가-힣]+ : 한글
////        [0-9]+ : 숫자
//        String answer2 = st1.replaceAll("[A-z]+", "");
//        System.out.println(answer2);
//        String input = "hello가나다";
//        System.out.println(input.matches("[A-Za-z]+"));
//        if(input.matches("[A-Za-z]+")){
//            System.out.println("정상 입력입니다");
//        }else{
//            System.out.println("입력을 확인해주세요");
//        }

////        전화번호 검증
//        String number = "010-1234-1234";
//        boolean b1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number);
//        System.out.println(b1);
//
////        이메일 검증 : 소문자@소문자.com
//        String email = "jh0221@naver.com";
//        boolean b2 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println(b2);
//
////        프로그래머스 : 문자열 다루기

////        split : 특정 문자를 기준으로 문자열을 자르는 것
//        String a = "a:b:c:d";
//        String[] arr1 = a.split(":");
//        System.out.println(Arrays.toString(arr1));
//        String b = "a b c    d";
//        String[] arr2 = b.split(" ");
//        System.out.println(Arrays.toString(arr2));
////        \\s : 공백
//        String[] arr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(arr3));
////        정규표현식 안쓰고 arr2의 알파벳 개수 구하는 방법
//        int count = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if(arr2[i] != ""){
//                count++;
//            }
//        }
//        System.out.println(count);

////        null과 공백의 차이
//        String st1 = null; //null은 String이 아님
//        String st2 = "";
//        String st3 = "hello";
//        System.out.println(st1 == st2); //false
//        System.out.println(st3.isEmpty()); //false
//        System.out.println(st2.isEmpty()); //true
//        System.out.println(st1.isEmpty()); //NullPointerExeption 발생

//        String[] arr = {"hello", "java", null, "python"};
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != null && arr[i].equals("python")){
//                answer = i;
//            }
//        }
//        System.out.println(answer);

////        문자열 조립 1
//        String[] arr = {"java", "python", "javascript"};
//        String answer = "";
//        for(String a : arr){
//            answer += a;
//        }
//
////        문자열 조립 2
//        String answer2 = String.join(":", arr);
//        System.out.println(answer2);

////        StringBuffer : 문자열 조립
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("python");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);

////        StringBuilder
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("java");
//        sb2.append("\n");
//        sb2.append("python");
//        sb2.append("\n");
//        sb2.append("javascript");
//        sb2.append("\n");
//        String answer3 = sb2.toString();
//        System.out.println(answer3);

//        문자열 뒤집기
        String st1 = "hello";
        StringBuilder sb = new StringBuilder(st1);
        sb.reverse();
        System.out.println(sb.toString());

//        프로그래머스 문자열 밀기


    }
}
