package com.mystudy.pract;

import java.awt.*;


//메소드 추가
public class ActionMeth {
    public static void action(Robot r){
        //action 매개변수가 Robot 타입 -> 자손클래스인 Dance/Sing/DrawRobot 인스턴스 모두
        //매개변수로 가능
        if( r instanceof DanceRobot){
            DanceRobot dr = (DanceRobot) r;
            dr.dance();
        } else if(r instanceof SingRobot){
            SingRobot sr = (SingRobot) r;
            sr.sing();
        } else if(r instanceof DrawRobot){
            DrawRobot dr = (DrawRobot) r;
            dr.draw();
        }
    }
    //instanceof 연산자 이용 -> 실제 인스턴스의 타입 확인

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(),new SingRobot(), new DrawRobot()};

        for(int i=0;i<arr.length;i++)
            action(arr[i]);
    }
}

class Robot{}

class DanceRobot extends Robot {
    void dance(){
        System.out.println("춤을 춥니다");
    }
}
class SingRobot extends Robot {
    void sing(){
        System.out.println("노래를 합니다");
    }
}
class DrawRobot extends Robot {
    void draw(){
        System.out.println("그림을 그립니다");
    }
}