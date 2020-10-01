package com.lang_010.duotai;

public class PoliceCar extends Car {
    private String owner="policeman";

    public PoliceCar(String color, String speed) {
        super(color, speed);
        this.owner=owner;
    }

    @Override
    public void runCar() {
        super.runCar();
        System.out.println(this.owner);
    }

    public void bibiCar() {
        System.out.println("bibiCar");
    }
}