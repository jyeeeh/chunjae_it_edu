package org.study.run;

public class LambdaExample {
    public static void main(String[] args) {
        action ((x, y)->{
            int result=x+y;
            System.out.println("result : "+result);
        });

        action ((x, y)->{
            int result=x-y;
            System.out.println("result : "+result);
        });
    }

    public static void action(Calculale calculale){
        int x=10;
        int y=4;
        calculale.calculate(x,y);
    }
}
