package org.study.run.exam2;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
    //정해져있지 않은 형태를 선언
        product1.setKind(new Tv()); //Tv클래스
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();



    }
}
