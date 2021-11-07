package com.xuexi.Constructor;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "奔驰";
        c.price = 42.6;
        System.out.println(c.name);
        System.out.println(c.price);

        Car d = new Car("宝马", 50.0);
        System.out.println(d.name);
        System.out.println(d.price);
    }
}
