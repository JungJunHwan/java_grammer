package C01Basic;

import java.util.Arrays;

public class C07Array {
    public static void main(String[] args) {
////        배열표현식1. 리터럴 방식
//        int[] intArr1 = {1, 3, 5, 7, 9};
//
////        배열표현식2. 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); //0으로 초기화 되어있음
//
////        참조자료형의 배열은 기본적으로 null 초기화
//        String[] stArr = new String[];
//        stArr[0] = "hello 1";
//        stArr[1] = "hello 2";
//        stArr[2] = "hello 3";
////        아래 코드는 NullPointerException 발생
//        for (int i = 0; i < stArr.length; i++) {
//            if(stArr[i].equals("hello10")){
//                System.out.println("hello10이 있습니다");
//            }
//        }
//
////        표현식3
//        int[] intArr3 = new int[]{1, 3, 5, 7, 9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});
//
////        표현식3 : 불가 -> 배열의 길이가 사전 지정되어야함
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        for (int i = 0; i < stArr.length; i++) {
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

////        실습 : 85, 65, 90인 int 배열은 선언하고 총합, 평균 구하기
//        int[] intArr = {85, 65, 90};
//        int sum = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            sum += intArr[i];
//        }
//        System.out.println("총합 : " + sum);
//        System.out.println("평균 : " + (double)sum/intArr.length);

////        배열의 최댓값, 최솟값
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = Integer.MIN_VALUE;
//        int min= Integer.MAX_VALUE;
//        for (int i : arr2) {
//            if (i > max) max = i;
//            if (i < min) min = i;
//        }
//        System.out.println(max);
//        System.out.println(min);

////        배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10,20,30,40,50};
//        for (int i = 0; i < arr2.length - 1; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기 : 새로운 배열을 선언하여, arr을 뒤집은 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] arrRev = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arrRev[i] = arr[arr.length - i - 1];
//        }
//        System.out.println(Arrays.toString(arrRev));

////        배열의 정렬
//        int[] arr = {17,12,20,10,25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        선택정렬 알고리즘 구현
        int[] arr = {17,12,20,10,25,18,4,30};
        int min ;
        int temp;
        int index;
        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            index = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
