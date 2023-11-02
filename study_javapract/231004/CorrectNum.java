package com.mystudy.pract;

import java.util.Scanner;

public class CorrectNum {
    //exercise4-14 숫자맞추기 게임
    public static void main(String[] args) {
        int answer=(int)(Math.random()*100)+1; //Math.random()
        int input=0; //사용자 입력 저장 공간
        int count=0; //시도횟수 세기 변수

        Scanner scanner = new Scanner(System.in);

        do{
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = scanner.nextInt();

            if(answer>input) {
                System.out.println("더 큰 수를 입력하세요");
            }
            else if(answer<input){
                System.out.println("더 작은수를 입력하세요");
            }
             else{
                System.out.println();
                System.out.println("시도횟수는 : "+count+"번입니다");
                break;
            }

        } while(true); //못맞추면 무한반복문
    }
}
