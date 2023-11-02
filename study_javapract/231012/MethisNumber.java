package com.mystudy.pract;

public class MethisNumber {
    public static boolean isNumber(String str){
        if(str==null||str.equals(""))
            return false;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); //0부터 str의 length 까지 숫자로만 판별되어있는지 돌려보기

            if(ch<'0'|| ch>'9'){ //숫자가아니면
            return false;           //false
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str="123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

        str="1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

    }
}
