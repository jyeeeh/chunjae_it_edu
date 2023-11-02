package com.mystudy.expt;

//예외 떠넘기기
public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("예외처리 : " + e.toString());       //예외 처리
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}


//[결과]
//예외처리 : java.lang.ClassNotFoundException: java.lang.String2
