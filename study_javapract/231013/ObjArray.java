package com.mystudy.pract;

public class ObjArray {

    public static int[] shuffle(int[] arr){        //반환타입 int[]
        // 유효성체크 해야함
        //넘겨받은 배열이 null or 0 -> 그대로 arr 반환
        if(arr==null || arr.length==0)
            return arr;

        for(int i=0;i<arr.length;i++) {
            int j = (int) (Math.random() * arr.length);

            //temp에 임시 저장 후 arr[i],[j] 서로 값 바꾸기
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}


