package com.mystudy.pract2;

import java.util.Scanner;

//1~100사이의 값을 맞추는 게임
//숫자가 아닌 영문자를 넣으면 예외처리
//숫자가 아닌 값을 입력했을 때 다시 입력을 받음
public class Exception1 {
    public static void main(String[] args) {
        //1~100사이의 임의의 값을 얻어서 answer에 저장
        int answer = (int)(Math.random()*100)+1;    //임의의 값
        int input=0; //사용자 입력 저장 공간
        int count=0; //시도 횟수 저장

        do{
            count++;
            System.out.println("1~100사이의 값을 입력하세요");

            try{
                input=new Scanner(System.in).nextInt();
            }catch(Exception e){    //예외처리
                System.out.println("유효하지않은 값입니다. 다시 입력해주세요");
                continue;
            }

            if(answer>input){
                System.out.println("더 큰 수를 입력하세요");
            }else if(answer<input){
                System.out.println("더 작은 수를 입력하세요");
            }else {
                System.out.println("정답입니다");
                System.out.println("시도횟수는 : "+count);
                break;
            }
        } while(true); //무한 반복문
    }
}