package com.lang_004.staticc;

public class Car {
    static String seats="5";
    private String color;
    private String speed;
    public Car(String color,String speed){
        this.color=color;
        this.speed=speed;
    }
    public void carRun(){
        System.out.println(color);
        System.out.println(speed);
        System.out.println(seats);
    }
}
