package com.xuexi.method;

/**
 * 1 java的方法由 修饰符 返回值类型 方法名 形参列表 方法体组成
 * (1)方法放置顺序可随意放置
 */

public class Method1 {
    public static void main(String[] args) {
        print();
        System.out.println(sum(100,20));
    }

    public static void print(){
        for (int i=0; i<2; i++){
            System.out.println("Hello world.");
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }


}
