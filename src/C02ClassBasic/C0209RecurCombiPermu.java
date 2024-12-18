package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
////        숫자가 1,2,3,4가 있을 때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
////        myList로 만들 수 있는 2개짜리 숫자 조합을 이중 리스트에 담아서 출력
////        [[1,2] [1,3] [1,4] [2,3] [2,4] [3,4]]
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i+1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//
//                answer.add(new ArrayList<>(temp));
//
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }

//         재귀함수 호출을 통한 조합 리스트 만들기
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
//        myList.add(6);
//        myList.add(7);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] isVisited = new boolean[myList.size()];
        int r = 2;

//        combi(myList, answer, temp, r, 0);
        permu(myList, answer, temp, r, isVisited);
        System.out.println(answer);

//        백준 : N과 M (15649)

//        백준 : 로또 (6603)
    }

    public static void combi(List<Integer> myList, List<List<Integer>> answer, List<Integer> temp, int r, int i){
        if(temp.size() == r){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for (int j = i; j < myList.size(); j++) {
            temp.add(myList.get(j));
            combi(myList, answer, temp, r, j+1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void permu(List<Integer> myList, List<List<Integer>> answer, List<Integer> temp, int r, boolean[] isVisited){
        if(temp.size() == r){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < myList.size(); i++) {
            if(isVisited[i]) continue;
            isVisited[i] = true;
            temp.add(myList.get(i));
            permu(myList, answer, temp, r, isVisited);
            isVisited[i] = false;
            temp.remove(temp.size() - 1);
        }


    }
}
