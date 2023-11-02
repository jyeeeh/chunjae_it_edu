package com.study.java;

public class Exercise4_9 {
    //문자열 str이 있을 때 각 자리 합을 더한 결과 출력 코드
    public static void main(String[] args) {
        String str = "12345";
        int sum =0;

        for(int i=0; i <str.length(); i++){
            sum+=str.charAt(i)-'0';
            //String으로 저장된 문자열 중에서 한글자만 선택해서 char타입으로 변환
            // 문자를 숫자로 바꾸는 방법은 문자에서 문자'0'을 빼면 가능
        }
        System.out.println("sum="+sum);
    }
}