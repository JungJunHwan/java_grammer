package C01Basic;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
////        Queue 인터페이스를 LinkedList가 구현한 벙식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        myQue에 데이터를 삭제하면서 가장 앞의 데이터를 반환
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
////        myQue에 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
//        System.out.println(myQue.peek());
//
////        LinkedList와 ArrayList 성능비교
////        중간 위치에 데이터 add 테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist : " + (endTime - startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Arraylist : " + (endTime2 - startTime2));
//
////        조회속도 비교
////        LinkedList 조회 속도
//        long startTime3 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedlist : " + (endTime3 - startTime3));
//
////        ArrayList 조회 속도
//        long startTime4 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("Arraylist : " + (endTime4 - startTime4));

        Queue<String> myQue = new LinkedList<>();
        myQue.add("문서1");
        myQue.add("문서2");
        myQue.add("문서3");
        while(!myQue.isEmpty()){
            System.out.println(myQue.poll());
        }

////        길이 제한 큐 : ArrayBlockingQueue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4");
////        큐에 여유공간이 있을때만 add
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

//        우선순위큐 : 데이터를 꺼낼 때 정렬된 데이터 poll
//        전체 정렬이 아닌, poll 할때마다 최솟값을 보장
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

//        백준 : 최소 힙

//        최대 힙인 경우
        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());

//        프로그래머스 : 같은 숫자는 싫어

    }
}
