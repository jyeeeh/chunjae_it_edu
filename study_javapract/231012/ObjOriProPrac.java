package com.mystudy.pract;

public class ObjOriProPrac {
    public static void main(String[] args) {

        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}

class SutdaCard {
    int num;
    boolean plusK;
    SutdaCard(){                //위에 new SutdaCard() 사용했으므로 card2 생성자 정의
        this(1, true);//SutdaCard(1, true) 호출
    }

    SutdaCard(int num, boolean isK){        //card1 정의
        this.num=num;
        this.plusK=plusK;
    }

    String info(){
        return num+(plusK? "K" : "");
    }
}

