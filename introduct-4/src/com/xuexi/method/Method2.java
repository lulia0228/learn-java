package com.xuexi.method;

/**
 * 2 java方法传参机制
 * 值传递和引用传递
 */

public class Method2 {
    public static void main(String[] args) {
        //1 理解值传递
        int a = 10;
        change1(a);
        System.out.println(a); //10

        //2 理解引用传递
        int[] arr = {1, 2, 3};
        change2(arr);
        System.out.println(arr[1]); //22
    }

    //值传递；不会改变变量
    public static void change1(int a){
        System.out.println(a); //10
        a = 20;
        System.out.println(a); //20
    }

    //引用传递;arr传递的是地址
    public static void change2(int[] arr){
        System.out.println(arr[1]); //2
        arr[1] = 22;
        System.out.println(arr[1]); //22
    }


}
