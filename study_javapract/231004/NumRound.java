package com.mystudy.pract;

public class NumRound {
    public static void main(String[] args) {
        int number=12321;
        int tmp=number;

        int result=0; // number을 거꾸로 변환해서 담음

        while(tmp!=0){
            result=result*10+tmp%10;
            tmp/=10;
        }

        if(number==result)
            System.out.println(number+"는 회문수 입니다");
        else
            System.out.println(number+"는 회문수가 아닙니다");
    }
}
