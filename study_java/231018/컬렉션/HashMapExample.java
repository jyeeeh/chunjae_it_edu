package lib01.ex01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>(); //String :키, Integer : 값 (키는 중복저장X, 값 중복저장 O)

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95); // 키 값이 같기 때문에 마지막에 저장한 값만 저장 < "홍길동", 90 (X)
        System.out.println("총 Entry 수 : "+map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key); // Map안의 값 가져오기
        System.out.println(key=": "+value);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+":"+v);
        }
        System.out.println();


        //엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet(); //entrySet() : Map에 저장되어있는 Entry객체들 반환
        //getKey()와 getValue() 각각 값 가져올 수 있음
        Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
        //iterator(반복) = 같은 컬렉션을 반복하는데 사용 할 수 있는 객체
        //iterator() : iterator 객체 반환
        while(entryIterator.hasNext()){ //hasNext() : 다음요소에 읽어올 요소가 있는지 확인하는 메소드, 있으면 true
            Entry<String, Integer> entry = entryIterator.next(); //next() : 다음요소를 가져옴
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+" : "+v);
        }
        System.out.println();


        //키로 엔트리 삭제
        map.remove("홍길동"); //Map 안의 내용 삭제
        System.out.println("총 Entry 수: "+map.size()); //map 크기 확인
        System.out.println();
    }
}
