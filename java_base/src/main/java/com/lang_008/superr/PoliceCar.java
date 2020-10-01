package com.lang_008.superr;

public class PoliceCar extends Car {
    private String owner="policeman";

    public PoliceCar(String color, String speed, String owner) {
        super(color, speed);
        this.owner=owner;
    }

    public void runCar() {
        super.runCar();
        System.out.println(this.owner);
    }
}