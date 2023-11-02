package com.mystudy.inter.exam02;

public class RemoteControlExample {
    public static void main(String[] args) {
 /*       System.out.println("리모콘 최대 볼륨: "+RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최대 볼륨: "+RemoteControl.MIN_VOLUME); */
        RemoteControl rc; //인터페이스 변수

        //Television 객체 생성하고 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
//        rc.turnOff();

        //Audio 객체 생성하고 변수에 대입
   /*     rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
*/
        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc=new Audio();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        //정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
