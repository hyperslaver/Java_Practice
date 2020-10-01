package com.lang_011.abstractt;

public class MainTester {
    public static void main(String[] args) {
        PoliceCar policeCar=new PoliceCar("blue","120");
        policeCar.runCar();
        System.out.println("==== 华丽的分割线 ====");
        FireCar fireCar=new FireCar("red","160");
        fireCar.runCar();
    }
}
