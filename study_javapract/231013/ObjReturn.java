package com.mystudy.pract;

public class ObjReturn {

    public static int max(int[] arr){
        if(arr==null||arr.length==0){
            return -999999;
        }

        int max=arr[0]; // 배열 첫번째값으로 초기화

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) //배열 0부터 최대까지 비교해보기
                max=arr[i];     //비교해봐서 큰 수를 max에 저장
        }

        return  max;
    }
    public static void main(String[] args) {
        int[] data={3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));       //null 이여서 return -999999;
        System.out.println("최대값:"+max(new int[]{})); //크기가 0인 배열

    }
}
