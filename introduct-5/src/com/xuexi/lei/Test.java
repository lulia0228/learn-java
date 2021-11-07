package com.xuexi.lei;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "奔驰GLC";
        c.price = 39.99;
        c.start();
        c.run();

        Car c2 = new Car();
        c2.name = "奥迪A6";
        c2.price = 45.00;
        c2.start();
        c2.run();
    }
}
