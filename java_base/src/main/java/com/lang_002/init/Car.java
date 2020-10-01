package com.lang_002.init;

public class Car {
    private String color;
    private String speed;
    public Car(String color,String speed){
        this.color=color;
        this.speed=speed;
    }
    public void carRun(){
        System.out.println(this.color);
        System.out.println(this.speed);
    }
}
