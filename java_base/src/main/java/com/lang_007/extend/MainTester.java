package com.lang_007.extend;

public class MainTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.setColor("red");
        car.setSpeed("120");
        car.runCar();
        System.out.println("==== 华丽的分割线 ====");
        PoliceCar policeCar=new PoliceCar();
        policeCar.setColor("blue");
        policeCar.setSpeed("180");
        policeCar.setOwner("policeman");
        policeCar.runCar();
    }
}
