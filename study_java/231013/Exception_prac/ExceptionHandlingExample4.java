package com.mystudy.expt;

//2가지 예외 동일 처리
public class ExceptionHandlingExample4 {
    public static void main(String[] args) {
        String[] array = {"100","1oo",null,"200"};

        for(int i=0;i<=array.length;i++){
            try{
                int value=Integer.parseInt(array[i]);
                System.out.println("array["+i+"]:"+value);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨; "+e.getMessage());
            }catch(NullPointerException|NumberFormatException e){
                System.out.println("데이터에 문제가 있음: "+e.getMessage()); //array[1,2]
            }
        }
    }
}

//        array[0]:100
//        데이터에 문제가 있음: For input string: "1oo"
//        데이터에 문제가 있음: null
//        array[3]:200
//        배열 인덱스가 초과됨; Index 4 out of bounds for length 4