package com.xuexi.method;

/**
 * 3 java方法重载，方法名相同，形参不同
 */

public class Method3 {
    public static void main(String[] args) {
        fire();
        fire("米国");
        fire("米国", 10);
    }

    public static void fire(){
        //System.out.println("默认发射一枚武器给米国");
        fire("米国");
    }

    public static void fire(String country){
        //System.out.println("默认发射一枚武器给"+country);
        fire(country,1);
    }

    public static void fire(String country, int a){
        System.out.println("默认发射"+a+"枚武器给"+country);
    }
}
