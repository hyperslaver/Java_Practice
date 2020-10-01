/*
1.修饰类
当用final修饰一个类时，表明这个类不能被继承。

2.修饰方法
把方法锁定，以防任何继承类修改它的含义。

3.修饰变量
1)对于一个final变量: 如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；
2)如果是引用类型的变量: 则在对其初始化之后便不能再让其指向另一个对象。
*/

package com.lang_012.finall;

public class MainTester {
    public static void main(String[] args) {
        Car car=new Car("red","120");
        car.runCar();
        System.out.println("==== 华丽的分割线 ====");

        // 二次新对象可以重新初始化final属性
        Car car2=new Car("red","130");
        car2.runCar();
        System.out.println("==== 华丽的分割线 ====");

        PoliceCar policeCar=new PoliceCar("blue","180");
        policeCar.runCar();
    }
}
