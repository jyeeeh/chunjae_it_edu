package com.study.java;

public class Exercise4_10 {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        
        while(num>0){ //각자리합을 더한 결과 출력 코드
            sum+=num%10;
            num/=10;
        }
        System.out.println("sum="+sum);
    }
}
