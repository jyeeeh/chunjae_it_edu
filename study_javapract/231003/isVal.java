package com.mystudy.pract;

//주어진 value 값이 숫자인지 판별

public class isVal {
    public static void main(String[] args) {
        String value="12o34";
        char ch=' ';
        boolean isNumber = true;

        //charAt(i) 한글자씩 읽어서 검사
        for (int i=0;i<value.length();i++){
            ch=value.charAt(i);

            if(!('0'<=ch&&ch<='9')){       // '0'~'9'면 참
                isNumber=false;
                break;
            }
        }
        if (isNumber){
            System.out.println(value+"는 숫자");
        }
        else {
            System.out.println(value+"는 숫자가 아님");
        }
    }
}
