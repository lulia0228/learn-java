package com.xuexi.type;

/**
 * 1 自动类型转换
 * 类型范围小的变量可以直接赋值给类型范围大的变量
 */

public class TypeDemo1 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;  //发生了自动类型转换
        System.out.println(b);
    }
}
