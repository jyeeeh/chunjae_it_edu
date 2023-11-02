package com.mystudy.pract;

//외부 클래스의 인스턴스 변수는 내부클래스에서
//'외부클래스이름.this.변수이름'으로 접근 가능

class Outer3{
    int value=10;       //Outer3.this.value 로 접근
    class Inner{    //인스턴스 클래스
        int value=20;       //this.value 로 접근

        void method1(){
            int value=30;

            System.out.println(value);          //30
            System.out.println(this.value);     //Inner에 20
            System.out.println(Outer3.this.value);  // 10
        }

    }
}
public class PrtInner {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner =  outer.new Inner();

        inner.method1();
    }
}
