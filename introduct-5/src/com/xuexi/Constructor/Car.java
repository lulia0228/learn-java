package com.xuexi.Constructor;


public class Car {
    String name;
    Double price;
    public Car(){
        System.out.println("无参构造器发生了调用");
    }

    public Car(String name, Double price){
        this.name = name;
        this.price = price;
        System.out.println("有参构造器发生了调用");
    }

}
