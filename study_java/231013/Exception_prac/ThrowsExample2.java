package com.mystudy.expt;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception { //main에 Exception 처리-> JVM이 최종적으로 예외처리
        findClass();
    }


    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
