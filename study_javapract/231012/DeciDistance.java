package com.mystudy.pract;

public class DeciDistance {

    static double getDistance(int x, int y, int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); //제곱근 계산 -> sqrt(double a) 사용
        //Math.pow(double a, double b) 사용시 -> Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2))
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
