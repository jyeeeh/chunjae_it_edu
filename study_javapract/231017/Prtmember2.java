package com.mystudy.pract;

//Outer2클래스 내부 클래스 Inner의 멤버변수 iv 값 출력
class Outer2{
    static class Inner{
        int iv=200;
    }
}
public class Prtmember2 {
    public static void main(String[] args) {

        Outer2.Inner ii = new Outer2.Inner();
        //static inner 클래스는 외부 클래스의 인스턴스 생성않고도 사용 가능
        System.out.println(ii.iv); //


    }

}
