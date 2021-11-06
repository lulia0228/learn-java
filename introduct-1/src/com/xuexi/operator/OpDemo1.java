package com.xuexi.operator;

/**
 * 1 基本运算，要注意除法的结果
 */

public class OpDemo1 {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println(a/b); //3
        System.out.println(a*1.0/b);//3.333...

        int c = 123;
        while (c!=0){
            System.out.println(c%10);
            c = c/10;
        }
    }
}
