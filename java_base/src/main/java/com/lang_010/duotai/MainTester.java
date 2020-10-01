package com.lang_010.duotai;

public class MainTester {
    public static void main(String[] args) {
        Car car=new Car("white","120");
        car.runCar();
        System.out.println("==== 华丽的分割线 ====");
        FireCar fireCar=new FireCar("red","160");
        fireCar.runCar();
        fireCar.waterCar();
        System.out.println("==== 华丽的分割线 ====");
        PoliceCar policeCar=new PoliceCar("blue","180");
        policeCar.runCar();
        policeCar.bibiCar();
    }
}
