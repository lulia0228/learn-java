package com.xuexi.operator;

/**
 * 2 "+"做连接符使用
 * 能算则算，不能算就拼接
 */

public class OpDemo2 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("abc"+a); //abc5
        System.out.println("abc"+'a'); //abca
        System.out.println("abc"+5+'a'); //abc5a
        System.out.println(a +'a'); //102
        System.out.println(a + "" + 'a'); //5a
    }
}
