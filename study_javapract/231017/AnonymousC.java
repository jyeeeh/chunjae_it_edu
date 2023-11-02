package com.mystudy.pract;

//(1)의 EventHandler를 익명 클래스로 변경하기


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
//(1)
public class AnonymousC {
    public static void main(String[] args) {
        //초기상태로 보여지지 않는 새로운 frame객체 생성
        Frame f = new Frame();
        //윈도우 포커스 리스너를 받기 위해서 윈도우 리스너 추가
        f.addWindowFocusListener(new EventHandler());
    }
}

class EventHandler extends WindowAdapter{
    public void windowClosing (WindowEvent e ){ //윈도우가 닫히는 과정에서 수행할 기능
        e.getWindow().setVisible(false);
        //false=창 안보임
        e.getWindow().dispose();
        //dispose() = 프레임 1개만(현재) 종료
        System.exit(0); // 전체 종료
    }
}
*/
//익명클래스로 변경(아래)
public class AnonymousC {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}