package com.lang_012.finall;

public class PoliceCar extends Car {
    private String owner="policeman";

    PoliceCar(String color, String speed){
        super(color,speed);
    }

/*
下面的方法runCar继承被禁止了，因为final方法不能被修改
public void setColor(String color){
    this.color=color;
}
    public void runCar() {
        super.runCar();
        System.out.println(this.owner);
        System.out.println("this is PoliceCar");
    }
 */
}