package com.mystudy.pract;

//섯다카드 20장 포함하는 섯다카드 한 벌 정의
//1~10까지가 한 쌍씩 / 1,3,8인 경우에는 둘중에 한장은 광
class SutdaDeck{        //SutdaCard2 배열 정의(공간만 생성함)
    final int CARD_NUM=20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck(){
        for(int i=0;i<cards.length;i++){
            int num=i%10+1; //1~10까지 넣어짐
            boolean isKwang=(i<10)&&(num==1||num==3||num==8); //and > or (우선순위)

            cards[i]=new SutdaCard2(num,isKwang);
        }
    }
}


class SutdaCard2{
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }
    SutdaCard2(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }

    public String toString(){
        return num+(isKwang?"K":"");
    }

}
public class Obj2Sutda {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i=0;i<deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
