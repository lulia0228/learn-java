package com.xuexi.array;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        //数组指向了同一个地址，会互相改变
        arr2[0] = 100;
        System.out.println(arr1[0]);
        arr1[2] = 300;
        System.out.println(arr2[2]);
    }
}
