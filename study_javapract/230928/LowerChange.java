package com.mystudy.pract;

public class Exercise3_10 {
    // 대문자를 소문자로 변경하는 코드
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = ('A'<=ch && ch <='Z')? (char) (ch + 32) : ch;

        System.out.println("ch :"+ch);
        System.out.println("ch to lowerCase :"+lowerCase);
    }
}
