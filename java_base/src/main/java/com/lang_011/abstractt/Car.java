/*
1、用abstract关键字来表达的类，其表达形式为：（public）abstract class 类名{}

2、抽象类不能被实例化，也就是说我们没法直接new 一个抽象类。抽象类本身就代表了一个类型，无法
确定为一个具体的对象，所以不能实例化就合乎情理了，只能有它的继承类实例化。

3、抽象类虽然不能被实例化，但有自己的构造方法（这个后面再讨论）

4、抽象类与接口（interface）有很大的不同之处，接口中不能有实例方法去实现业务逻辑，而抽象类
中可以有实例方法，并实现业务逻辑，比如我们可以在抽象类中创建和销毁一个线程池。

5、抽象类不能使用final关键字修饰，因为final修饰的类是无法被继承，而对于抽象类来说就是
需要通过继承去实现抽象方法，这又会产生矛盾。（后面将写一篇关于finally的文章详细讨论）
 */
package com.lang_011.abstractt;

public abstract class Car {
    private String color;
    private String speed;

    Car(String color,String speed){
        this.color=color;
        this.speed=speed;
    }

    public void runCar(){
        System.out.println("init runCar");
    }
}
