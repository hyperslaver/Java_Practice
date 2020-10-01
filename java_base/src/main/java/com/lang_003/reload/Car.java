package com.lang_003.reload;

public class Car {
    private String color;
    private String speed;
    private String seats;
    public Car(String color,String speed) {
        this.color=color;
        this.speed=speed;
    }
    public Car(String color,String speed,String seats){
        this.color=color;
        this.speed=speed;
        this.seats=seats;
    }
    public void runCar(){
        if(this.color != null) {
            System.out.println(this.color);
        }
        if(this.speed != null) {
            System.out.println(this.speed);
        }
        if(this.seats != null) {
            System.out.println(this.seats);
        }
    }
}
