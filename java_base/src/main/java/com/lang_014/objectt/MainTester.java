package com.lang_014.objectt;

public class MainTester {
    public static void main(String[] args) {
        Car car=new Car();
        Car car2=new Car();
        System.out.println(car.toString());
        System.out.println(car.equals(car2));
        System.out.println(car.getClass());
    }
}
