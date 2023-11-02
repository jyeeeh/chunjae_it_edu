package com.mystudy.pract2;
//Point3D클래스의 equals()를 멤버변수인 x,y,z의 값을 비교하도록 오버라이딩 함

public class Overrd1 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1); //[1,2,3]
        System.out.println(p2); //[1,2,3]
        System.out.println("p1==p2?"+(p1==p2)); //p1==p2?false
        System.out.println("p1.equals(p2)?"+p1.equals(p2)); //p1.equals(p2)?true
    }
}

class Point3D {
    int x,y,z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D(){
        this(0,0,0);
    }

    public boolean equals(Object obj){
        //데이터타입이 Object인 obj값을 받는 equals 메서드
        if(obj instanceof Point3D){ //obj가 Point3D의 instance인지 true/false 리턴
            Point3D p = (Point3D)obj;
            return x==p.x&&y==p.y&&z==p.z;
        }
        return false;
    }

    public String toString(){
        return "["+x+","+y+","+z+"]";
    }
}
