package com.lang_009.overridee;

public class PoliceCarTester {
    public static void main(String[] args) {
        Car car=new Car("green","120");
        car.runCar();
        System.out.println("==== 华丽的分割线 ====");
        PoliceCar policeCar=new PoliceCar("red","180","policeman");
        policeCar.runCar();
    }
}
