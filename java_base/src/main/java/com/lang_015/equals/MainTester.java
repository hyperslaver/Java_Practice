/*
对象之间，equals和== 都比较内存地址，行为完全一样。
 String之间，equal比较的是值相同，==比较的是内存地址相同。
*/
package com.lang_015.equals;

public class MainTester {
    public static void main(String[] args) {
        //对象之间，equals和== 都比较内存地址，行为完全一样。
        System.out.println("==== 对象之间对比 ====");
        Car car1=new Car("blue","120");
        Car car2=new Car("blue","120");
        if(car1.equals(car2)) {
            System.out.println("car1.equals(car2): True");
        }
        else {
            System.out.println("car1.equals(car2): False");
        }
        if(car1==car2) {
            System.out.println("car1==car2: True");
        }
        else {
            System.out.println("car1==car2: False");
        }

        System.out.println("==== car1=car2 ====");
        car1=car2;
        if(car1.equals(car2)) {
            System.out.println("car1.equals(car2): True");
        }
        else {
            System.out.println("car1.equals(car2): False");
        }
        if(car1==car2) {
            System.out.println("car1==car2: True");
        }
        else {
            System.out.println("car1==car2: False");
        }

        // String之间，equal比较的是值相同，==比较的是内存地址相同。
        System.out.println("==== String之间对比 ====");
        String s1=new String("abc");
        String s2=new String("abc");
        if(s1.equals(s2)){
            System.out.println("s1 equals s2: True");
        }
        else {
            System.out.println("s1 equals s2: False");
        }
        if(s1==s2){
            System.out.println("s1==s2: True");
        }
        else {
            System.out.println("s1==s2: False");
        }

        System.out.println("==== s1=s2 ====");
        s1=s2;
        if(s1.equals(s2)){
            System.out.println("s1 equals s2: True");
        }
        else {
            System.out.println("s1 equals s2: False");
        }
        if(s1==s2){
            System.out.println("s1==s2: True");
        }
        else {
            System.out.println("s1==s2: False");
        }
    }
}
