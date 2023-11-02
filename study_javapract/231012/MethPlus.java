package com.mystudy.pract;

public class MethPlus {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="jyeeeh";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() { //국어+영어+수학 점수 더해서 반환, int값, 매개변수 x
        return kor + eng + math;
    }

    float getAverage(){
        return (int)(getTotal()/3); //-> (int)(getTotal()/3f*10+0.5f)/10f
    }
}
