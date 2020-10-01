/*
接口的作用是什么？
笔者认为接口是一种协议。
例如两个开发者，开发时间完全不一致，那么需要两个人的配合开发，则需要一个人讲接口写好，
定义好其中所有的变量命名规范、函数定义规范。具体实现类的开发人员则只需要按照接口实现相应功能即可。
 */
package com.lang_013.interfacee;

public class MainTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.runCar();
        System.out.println("==== 华丽的分割线 ====");
        PoliceCar policeCar=new PoliceCar();
        policeCar.runCar();
        policeCar.runPoliceCar();
        System.out.println("==== 华丽的分割线 ====");
        FireCar fireCar=new FireCar();
        fireCar.runCar();
        fireCar.runFireCar();
    }
}
