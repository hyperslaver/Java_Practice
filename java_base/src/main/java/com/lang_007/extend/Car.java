package com.lang_007.extend;

public class Car {
    protected String color;
    protected String speed;

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void runCar(){
        System.out.println(color);
        System.out.println(speed);
    }
}
