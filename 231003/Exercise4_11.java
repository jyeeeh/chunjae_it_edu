package com.study.java;

public class Exercise4_11 {
    //피보나치수열
    public static void main(String[] args) {
        int n1=1;
        int n2=1;
        int n3=0;
        System.out.print(n1+","+n2);

        for(int i=0; i<8;i++){
            n3=n1+n2; // 첫+두값 더하기 = 세번째 값
            System.out.print(","+n3);
            n1=n2;
            n2=n3;
        }
    }
}
