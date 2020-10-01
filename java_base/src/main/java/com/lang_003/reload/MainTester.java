package com.lang_003.reload;
import com.lang_003.reload.Car;

public class MainTester {
    public static void main(String[] args) {
        Car car01=new Car("red","120");
        car01.runCar();
        System.out.println("==== 华丽的分割线 ====");
        Car car02=new Car("green","120","5");
        car02.runCar();
    }

}
