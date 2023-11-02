package com.mystudy.pract;

public class ObjAbsReturn {
    //주어진 값(반환타입 int) 절대값 반환

    public static int abs(int value){
        return value>=0? value : -value;         //양수면 value값 그대로 반환 음수면 부호 바꿔서
    }

    public static void main(String[] args) {
        int value=5;
        System.out.println(value+"의 절대값:"+abs(value));
        value=-10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
