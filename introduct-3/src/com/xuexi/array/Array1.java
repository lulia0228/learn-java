package com.xuexi.array;

import javax.print.DocFlavor;

/**
 * 1 java中数组的定义与使用
 * 定义： 数据类型[] 数组名
 */

public class Array1 {
    public static void main(String[] args) {
        //定义静态数组
        //double[] scores = new double[]{99.5, 88.0, 75.5};
        double[] scores = {99.5, 88.0, 75.5};
        int[] ages = {12, 24, 36};
        String[] names = {"张三", "李四", "wangwu"};
        scores[2] = 100;
        System.out.println(scores[2]);
        System.out.println(ages.length);
        System.out.println(names[names.length-1]);

        //定义动态数组
        int[] arr = new int[3];
        arr[0] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //数组默认值
        //整型默认为0；浮点型默认为0.0；char默认为0；boolean默认false;String默认为null
        char[] chs = new char[100];
        System.out.println((int)chs[2]);

        //二维数组




    }
}
