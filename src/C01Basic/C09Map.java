package C01Basic;

import java.sql.SQLOutput;
import java.util.*;

public class C09Map {
    public static void main(String[] args) {
////        map은 index 요소가 없으므로, 순서가 무의미
////        key값은 중복되지 않고, 만약에 동일한 key 값으로 다른 value를 넣으면 value를 덮어쓰기함
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이");
//        System.out.println(sports);
//
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 복잡도는 O(1)
//        System.out.println(sports.get("baseball"));
//
////        map의 전체 데이터 조회
////        keySet() : map의 key 목록을 리턴하는 메서드
////        values() : map의 value 목록을 리턴하는 메서드
//        for(String key : sports.keySet()){
//            System.out.println("sports의 key 값은 " + key);
//            System.out.println("sports의 value 값은 " + sports.get(key));
//        }
//
////        remove : key를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("baseball", "야구");
//        System.out.println(sports);
//
////        getOrDefault : key가 없으면 default 값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("pingpong", "그런 키 없음"));
//        System.out.println(sports.getOrDefault("baseball", "그런 키 없음"));
//
////        containsKey : key가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));

//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
////        농구:2, 축구:2, 야구:1
//        Map<String, Integer> sports = new HashMap<>();
//        for (String key : arr) {
//            sports.put(key, sports.getOrDefault(key, 0) + 1);
////            if (!sports.containsKey(key)) {
////                sports.put(key, 1);
////            } else {
////                sports.put(key, sports.get(key) + 1);
////            }
//        }
//        System.out.println(sports);

////        프로그래머스 : 완주하지 못한 선수
//
////        프로그래머스 : 의상
//
////        LinkedHashMap : 데이터의 삽입 순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello 5", 1);
//        linkedMap.put("hello 4", 2);
//        linkedMap.put("hello 3", 3);
//        linkedMap.put("hello 2", 4);
//        linkedMap.put("hello 1", 5);
//        for(String l : linkedMap.keySet()){
//            System.out.println("key : " + l);
//        }

////        TreeMap : key를 통해 데이터를 정렬
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello 5", 1);
//        treeMap.put("hello 4", 2);
//        treeMap.put("hello 3", 3);
//        treeMap.put("hello 2", 4);
//        treeMap.put("hello 1", 5);
//        for(String t : treeMap.keySet()){
//            System.out.println("key : " + t);
//        }

////        Hash맵을 사용해서 key값으로 정렬
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("hello 5", 1);
//        myMap.put("hello 4", 4);
//        myMap.put("hello 3", 3);
//        myMap.put("hello 2", 2);
//        myMap.put("hello 1", 5);
//        List<String> myList = new ArrayList<>();
//        for (String m : myMap.keySet()){
//            myList.add(m);
//        }
//        myList.sort(Comparator.naturalOrder());
//        for (String l : myList) {
//            System.out.println("key : " + l + ", value : " + myMap.get(l));
//        }
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o1) - myMap.get(o2); //오름차순, o1/o2순서 바꾸면 내림차순
//            }
//        });
//        System.out.println(myList);

//        hashmap 출력방법 2가지 : 1. 강화된 for문 2. iterator
        Map<String, String> myMap = new HashMap<>();
        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
        for(String a : myMap.keySet()){
            System.out.println(a);
        }

        Iterator<String> myIters = myMap.keySet().iterator();
//        next 메서드는 데이터를 하나씩 소모시키며 값을 반환
        System.out.println(myIters.next());
//        hasNext는 iterator 안에 그 다음값이 있는지 없는지 boolean return
        while(myIters.hasNext()){
            System.out.println(myIters.next());
        }
    }
}
