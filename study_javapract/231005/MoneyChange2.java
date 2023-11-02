package com.mystudy.pract;
//231005
//거슬러 줄 금액을 입력받고 계산
public class MoneyChange2 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("USAGE: java MoneyChange2 3120");
            System.exit(0); // 종료
        }

        int money = Integer.parseInt(args[0]);
        System.out.println("money="+money);

        int[] coinUnit = {500,100,50,10}; //동전 단위
        int[] coin = {5,5,5,5}; //단위별 동전의 개수

        for(int i=0;i<coinUnit.length;i++){
            int coinNum=0;
            //필요한 동전 개수 구하기
            coinNum = money/coinUnit[i];

            if(coin[i]>=coinNum){
                coin[i]-=coinNum; //충분히 있으면 coin 에서 coinNum만큼 동전 -
            }else{ //동전이 없으면 배열에 있는 개수만큼만 -
                coinNum=coin[i];
                coin[i]=0;
            }

            money-=coinNum*coinUnit[i];

            System.out.println(coinUnit[i]+"원: "+coinNum);
        }

        if(money>0){
            System.out.println("거스름돈 부족");
            System.exit(0); // 프로그램 종료
        }

        System.out.println("====남은 동전의 개수====");

        for(int i=0;i<coinUnit.length;i++){
            System.out.println(coinUnit[i]+"원:"+coin[i]);
        }
    }
}
