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
////        표현식4 : 불가 -> 배열의 길이가 사전 지정되어야함
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

////        선택정렬 알고리즘 구현
//        int[] arr = {17,12,20,10,25,18,4,30};
//        int min;
//        int temp;
//        int index;
//        for (int i = 0; i < arr.length; i++) {
//            min = arr[i];
//            index = i;
//            for (int j = i+1; j < arr.length-1; j++) {
//                if(arr[j] < min){
//                    min = arr[j];
//                    index = j;
//                }
//            }
//            temp = arr[i];
//            arr[i] = min;
//            arr[index] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

////        문자정렬
////        아스키코드 기준으로 정렬
//        String[] fruits = {"banana", "apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple", "applee", "applef"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
////        내림차순 : 기본형 타입은 Comparator로 처리 불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));

////        프로그래머스 : K번째수
//        int[] answer = new int[commands.length];
//
//        for (int i = 0; i < commands.length; i++) {
//            int[] conArr = new int[commands[i][1] - commands[i][0] + 1];
//            int index = commands[i][0] - 1;
//            for (int j = 0; j < conArr.length; j++) {
//                conArr[j] = array[index];
//                index++;
//            }
//            Arrays.sort(conArr);
//            answer[i] = conArr[commands[i][2] - 1];
//        }
//        return answer;

////        숫자 조합의 합
////        모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 2개의 조합의 합을 출력하라
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        int n = intArr.length;
//        int r = 2;
//
//        int[] answerList = new int[n * (n-1) / r];
//        int index = 0;
//
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = i + 1; j < intArr.length; j++) {
//                answerList[index] = intArr[i] + intArr[j];
//                index++;
//            }
//        }
//        Arrays.sort(answerList);
//        int count = 0;
//        for (int i = 0; i < answerList.length-1; i++) {
//            if(answerList[i] != answerList[i+1]) count++;
//        }
//        int[] answer = new int[++count];
//        index = 0;
//        for (int i = 0; i < answerList.length-1; i++) {
//            if(answerList[i] != answerList[i+1]){
//                answer[index] = answerList[i];
//                index++;
//            }
//        }
//        answer[answer.length - 1] = answerList[answerList.length - 1];
//
//        System.out.println(Arrays.toString(answerList));
//        System.out.println(Arrays.toString(answer));

////        배열의 복사
////        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int[] answer = new int[]{1,2,3,4,5,6,7,8};
//        int[] copy1 = Arrays.copyOf(answer, answer.length);
//        int[] copy2 = Arrays.copyOfRange(answer, 2, 6);
//        System.out.println(Arrays.toString(copy1));
//        System.out.println(Arrays.toString(copy2));

////        프로그래머스 : 두 개 뽑아서 더하기

////        배열의 검색
//        int[] arr = {5,3,1,8,7,8};
//        int target = 8;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                System.out.println(i);
//                break;
//            }
//        }

////        이진검색 (binary search) - 이분탐색, log_2_n의 복잡도
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능
////        백준 - 수 찾기 (1920)
//        int[] arr = {1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr, 15));

////        베열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

////        2차원 배열의 선언과 할당
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[1][0] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//        int[][] arr2 = {{10,20,30}, {40,50,60}};

////        가변배열 선언 후 할당
//        int[][] arr1 = new int[2][];
//        arr1[0] = new int[2];
//        arr1[1] = new int[3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[1][0] = 30;
//        arr1[1][1] = 40;
//        arr1[1][2] = 50;
//
////        가변배열 리터럴 방식
//        int[][]arr2 = {{10,20}, {30,40,50}};

////        [3][4] 사이즈 배열 선언하고
////        1~12까지 숫자값을 각 배열에 순차적으로 할당
//        int[][] arr = new int[3][4];
//        int n = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = n++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        int[][] arr = new int[3][];
//        int n = 1;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[4];
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = n++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        프로그래머스 - 행렬의 덧셈

    }
}
