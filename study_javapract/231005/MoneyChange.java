package com.mystudy.pract;
//231005
//거스름돈을 몇 개의 동전으로 지불할 수 있는지
public class MoneyChange {
    public static void main(String[] args) {
        //큰 금액 동전 우선적으로 거슬러주기

        int[] coinUnit={500,100,50,10}; // 단위: 원

        int money=2680;
        System.out.println("money="+money);

        for(int i=0;i<coinUnit.length;i++){

            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
            money=money%coinUnit[i];
        }
    }
}
