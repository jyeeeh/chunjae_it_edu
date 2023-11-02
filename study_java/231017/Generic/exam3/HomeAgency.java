package org.study.run.exam3;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home(); //Home 클래스 리턴
    }
}
