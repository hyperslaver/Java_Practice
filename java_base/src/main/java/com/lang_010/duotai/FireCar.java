package com.lang_010.duotai;

public class FireCar extends Car {
    private String owner="fireman";

    public FireCar(String color, String speed) {
        super(color, speed);
        this.owner=owner;
    }

    @Override
    public void runCar() {
        super.runCar();
        System.out.println(this.owner);
    }

    public void waterCar() {
        System.out.println("water car");
    }
}