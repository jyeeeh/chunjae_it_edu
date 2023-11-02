package com.mystudy.pract;

//231005
//배열 answer에 담긴 데이터 읽고 숫자 개수 세어서 개수만큼 * 찍음
public class CountNum {
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for(int i=0;i<answer.length;i++){
            counter[answer[i]-1]++;   //크기가 n이지만 배열의 index는 0~n-1
        }

        for(int i=0;i<counter.length;i++){
            System.out.print(counter[i]);

            for(int j=0;j<counter[i];j++){
                System.out.print("*"); //counter[i]값만큼 * 찍기
            }
            System.out.println();
        }
    }
}