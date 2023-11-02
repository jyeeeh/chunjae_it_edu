package com.mystudy.pract;
//Outer클래스의 내부 클래스 Inner 멤버변수 iv값 출력
class Outer { //외부 클래스
    class Inner{ //내부클래스
        int iv=100;
    }
}
//내부 클래스 인스턴스 생성위해서는

public class Prtmember {
    public static void main(String[] args) {
        Outer o = new Outer(); // 외부 클래스 인스턴스 먼저 생성
        Outer.Inner ii = o.new Inner();
        //외부클래스의 인스턴스가 생성되어야 인스턴스 클래스 사용 가능
        System.out.println(ii.iv);
    }
}
