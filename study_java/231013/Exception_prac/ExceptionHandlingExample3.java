package com.mystudy.expt;

public class ExceptionHandlingExample3 {

    public static void main(String[] args) {
        try{
            Class.forName("java.lang.String");  //ClassNotFoundException 발생 코드
            System.out.println("java.lang.String 클래스가 존재합니다");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println();

        try{
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다."); //ClassNotFoundException 발생 코드
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
