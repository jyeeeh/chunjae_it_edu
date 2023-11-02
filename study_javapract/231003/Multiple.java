package com.mystudy.pract;

//구구단 일부분 출력

public class Multiple {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=3;j++){
                int x=j+1+(i-1)/3*3;
                int y=1%3==0? 3: 1%3;

                if(x>9)     //9단까지 출력
                    break;

                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
            if(i%3==0) System.out.println();
        }
    }
}
