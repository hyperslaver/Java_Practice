package com.lang_012.finall;

/*
下面的类如果是final，是禁止被后面PoliceCar继承的
public final class Car {
 */

public class Car {
    private final String color;
    private final String speed;
    public Car(String color,String speed){
        this.color=color;
        this.speed=speed;
    }
    /*
    下面的初始化被禁止了，因为final属性不能被二次设置
    public void setColor(String color){
        this.color=color;
    }
     */
    public final void runCar(){
        System.out.println(this.color);
        System.out.println(this.speed);
    }
}
