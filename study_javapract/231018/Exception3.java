package com.mystudy.pract2;

public class Exception3 {
    public static void main(String[] args) {
    try {
        method1(); // 예외 발생
        System.out.println(6); //앞서 예외 발생으로 실행 x
    } catch (Exception e ){
        System.out.println(7);
        //모든 종류의 예외처리가능 => 7출력(세번째출력)
    }
}

static void method1() throws Exception{
    try{
        method2(); //nullpointerexceptiond으로
        System.out.println(1);
    }catch(NullPointerException e){
        System.out.println(2); // => 2 출력 (첫출력)
        throw e; //예외 다시 발생시킴 => method1()이 종료
    }catch (Exception e){
        System.out.println(3);
    } finally{
        System.out.println(4); //=>4출력 (두번째출력)
    }

    System.out.println(5);
}
    static void method2(){
    throw new NullPointerException(); //method2() => NullPointerExcepiton 발생시킴
    }
}
