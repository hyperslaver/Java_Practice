/*
https://blog.csdn.net/sdjadycsdn/article/details/81560096
private：Java语言中对访问权限限制的最窄的修饰符，一般称之为“私有的”。被其修饰的属性以及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问。
default：即不加任何访问修饰符，通常称为“默认访问权限“或者“包访问权限”。该模式下，只允许在同一个包中进行访问。
protected：介于public 和 private 之间的一种访问修饰符，一般称之为“保护访问权限”。被其修饰的属性以及方法只能被类本身的方法及子类访问，即使子类在不同的包中也可以访问。
public： Java语言中访问限制最宽的修饰符，一般称之为“公共的”。被其修饰的类、属性以及方法不仅可以跨类访问，而且允许跨包访问。
 */
package com.lang_005.permission;

public class Car {
    private String color;
    String speed;
    public  String seats;
    protected String wheels;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void carRun(){
        System.out.println(color);
        System.out.println(speed);
        System.out.println(seats);
        System.out.println(wheels);
    }
}
