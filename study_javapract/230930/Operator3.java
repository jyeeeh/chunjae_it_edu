package com.mystudy.pract;

public class Exercise3_3 {
    //num에 따라 양수, 음수, 0 출력하는 코드 구하기 "삼항연산자"이용
    public static void main(String[] args) {
        int num = -2;
        System.out.println(num>0 ? "양수" : (num<0) ? "음수" : 0); // <- 삼항연산자 사용
    }
}
