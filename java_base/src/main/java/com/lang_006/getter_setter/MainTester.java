package com.lang_006.getter_setter;

public class MainTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.setColor("red");
        car.setSpeed("120");
        System.out.println(car.getColor());
        System.out.println(car.getSpeed());
    }
}
