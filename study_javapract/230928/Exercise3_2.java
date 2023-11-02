package com.mystudy.pract;

public class Exercise3_2 {
    // 사과를 담는데 필요한 바구니 개수 구하기 코드
    public static void main(String[] args) {
        int Apples = 123;
        int sizeOfBucket = 10;
        int numOfBuckt = Apples/sizeOfBucket+(Apples%sizeOfBucket>0? 1: 0); // 나머지가 0이상이면 +1 아니면 +0

        System.out.println("필요한 바구니의 수 : " +numOfBuckt);
    }
}
