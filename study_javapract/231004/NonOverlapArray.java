package com.mystudy.array;

public class NonOverlapArray {
    public static void main(String[] args) {

    int[] ballArr={1,2,3,4,5,6,7,8,9};
    int[] ball3 = new int[3];
    //배열 ballArr의 임의 요소 골라서 위치 바꾸기
    for(int i=0;i<ballArr.length;i++){
        int j = (int)(Math.random()*ballArr.length);
        int tmp=0;

        tmp=ballArr[i];
        ballArr[i]=ballArr[j];
        ballArr[j]=tmp;
    }
        //배열 ballArr의 앞에서 3개의 수배열 ball3로 복사
        System.arraycopy(ballArr,0, ball3,0,3);

    for (int i=0;i<ball3.length;i++){
        System.out.print(ball3[i]);
    }
        System.out.println();
}
    }
