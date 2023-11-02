package com.mystudy.abstr;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("망곰");


        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
