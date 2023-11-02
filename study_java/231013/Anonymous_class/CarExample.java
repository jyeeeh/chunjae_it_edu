package com.mystudy.noname;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();

        car.run2();

        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다");
            }
        }); //파라미터 자리에 기능을 집어넣음 = 익명개체 -> 명령을 끝내야되니까 세미콜론 마무리
    }
}
