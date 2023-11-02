package com.mystudy.pract;

import java.awt.*;

//Shape = 도형정의 클래스 -> Circle, Rectangle클래스 
abstract class Shape {
    Point p;
    
    Shape() {
        this(new Point(0,0));
    }

    Shape(Point p){
        this.p=p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메소드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

//---------------------//
class Rect extends Shape{       //Rectangle 클래스 - 조상클래스Shape
    double width;   //폭
    double height;  //높이

    Rect(double width, double height){
        this(new Point(0,0),width,height);
    }

    Rect(Point p, double width, double height){
        super(p);       //조상의 멤버 -> 조상의 생성자가 초기화
        this.width=width;
        this.height=height;
    }
    boolean isSquare(){     //정사각형인지 아닌지 알려주기
        //width=height 같으면 true반환
        return width*height!=0&&width==height; //가로, 세로가 같고 서로 곱할때 0 이 아니면
    }
    double calcArea(){
        return width*height;
    }
}

class Circle extends Shape{
    double r; //반지름

    Circle(double r){
        this(new Point(0,0),r); //Circle(Point p, double r) 호출
    }

    Circle(Point p, double r){
        super(p);
        this.r=r;
    }

    double calcArea(){
        return Math.PI*r*r;
    }
}

class Point{
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "["+x+","+y+"]";
    }

}