package com.xuexi.type;

/**
 * 2 强制类型转换
 */

public class TypeDemo2 {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte) a; //byte占1个字节，8位
        System.out.println(a);
        System.out.println(b);

        int c = 1500;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);
    }
}
