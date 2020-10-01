package com.lang_007.extend;
import com.lang_007.extend.Car;

public class PoliceCar extends Car{
    private String owner;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void runCar() {
        super.runCar();
        System.out.println(this.owner);
    }
}