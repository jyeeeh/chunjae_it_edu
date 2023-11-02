package com.mystudy.pract;

public class Exercise3_9 {
    //변수가 영문자이거나 숫자일때만 변수 boolean 값이 true가 되도록 하기

    public static void main(String[] args) {
        char ch='z';
        boolean b = ('a'<=ch && ch <= 'z') || ('A'<=ch && ch <= 'z') || ('0'<=ch && ch <='9'); //소문자, 대문자, 숫자일 때 구별

        System.out.println(b);
    }
}
