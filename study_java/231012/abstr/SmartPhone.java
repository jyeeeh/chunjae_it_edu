package com.mystudy.abstr;

public class SmartPhone extends Phone{

    public SmartPhone(String owner) { //Phone 생성자 호출
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
