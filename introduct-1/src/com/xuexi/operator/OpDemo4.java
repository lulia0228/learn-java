package com.xuexi.operator;

/**
 * 4 逻辑运算符
 * &(与) |(或) ^(异或) !(非)
 * &&(短路与) 和& 判断结果一样，区别是如果左边为false右边不执行
 * ||(短路或) 和| 判断结果一样，区别是如果左边为true右边不执行
 */

public class OpDemo4 {
    public static void main(String[] args) {
        double size = 9.8, storage = 16;
        if (size >= 6.9 & storage >=8){
            System.out.println("满足要求！");
        }
    }
}
