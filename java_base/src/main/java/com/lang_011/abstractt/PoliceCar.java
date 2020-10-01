package com.lang_011.abstractt;
import com.lang_011.abstractt.Car;

public class PoliceCar extends Car {
    private String owner="policeman";

    PoliceCar(String color,String speed){
        super(color,speed);
    }

    @Override
    public void runCar() {
        super.runCar();
        System.out.println(this.owner);
        System.out.println("this is PoliceCar");
    }
}