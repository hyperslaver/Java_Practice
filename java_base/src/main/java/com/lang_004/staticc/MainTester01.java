package com.lang_004.staticc;

public class MainTester01 {
    public static void main(String[] args) {
        Car car01=new Car("red","120");
        car01.carRun();
        System.out.println("==== 华丽的分割线 ====");
        Car.seats="6";
        car01.carRun();
        System.out.println("==== 华丽的分割线 ====");
        Car car02=new Car("green","100");
        car02.carRun();
    }
}
