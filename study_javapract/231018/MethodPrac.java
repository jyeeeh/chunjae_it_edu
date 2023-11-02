package com.mystudy.pract2;
//수행결과 알아보기
public class MethodPrac {
    static void method(boolean b){
        try{
            System.out.println(1);
            if(b) System.exit(0);
            System.out.println(2);
        } catch(RuntimeException r){
            System.out.println(3);
            return;
        } catch(Exception e){
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        method(true);
        //변수 b 값이 true 이므로 System.exit(0)이 수행되어 프로그램이 종료되어버림
        //=> finally 블럭 수행x
        method(false);
    }
}