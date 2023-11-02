package com.mystudy.pract;

public class ObjTest {

    public static void change(String str){
        str+="456";  //여기서 ABC123+456 => ABC123456
    }

    public static void main(String[] args) {
        String str="ABC123";
        System.out.println(str);        //ABC123 출력
        change(str);
        // change 메소드가 종료되고 사용하던 메모리를 반환하므로
        // 지역변수인 str 도 메모리에서 제거 => 처음값(ABC123) 과 동일
        // ABC123456은 가비지컬렉터에 의해 제거됨
        System.out.println("After change:"+str); // =>ABC123
    }
}
