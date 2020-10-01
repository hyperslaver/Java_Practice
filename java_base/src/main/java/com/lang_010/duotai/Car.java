package com.lang_010.duotai;

public class Car {
    private String color;
    private String speed;

    public Car(String color,String speed){
        this.color=color;
        this.speed=speed;
    }

    public void runCar(){
        System.out.println(color);
        System.out.println(speed);
    }
}
