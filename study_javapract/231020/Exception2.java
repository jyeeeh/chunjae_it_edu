package com.mystudy.pract2;

class UnsupportedFunctionException2 extends RuntimeException {
    private final int ERR_CODE; //제어자 : final private , 타입 int

    UnsupportedFunctionException2(String msg, int errCode) { //생성자
        super(msg);     //조상의 생성자 RuntimeException(String msg)를 호출
        ERR_CODE=errCode;
    }
    UnsupportedFunctionException2(String msg){ //생성자
        this(msg,100); //ERR_CODE를 100(기본값)으로 초기화
    }

    public int getErrCode(){
        return ERR_CODE; //에러코드를 얻을 수 있는 메소드
    }

    public String getMessage(){ //Exception의 getMessage()를 오버라이딩함
        return "["+getErrCode()+"]"+super.getMessage();
    }
}
public class Exception2 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException2("지원하지않는 기능입니다",100);
    }
}
//결과 => Exception in thread "main" com.mystudy.pract2.UnsupportedFunctionException2: [100]지원하지않는 기능입니다
//	at com.mystudy.pract2.Exception2.main(Exception2.java:24)