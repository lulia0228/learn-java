package com.xuexi.condition;

/**
 * 1 for循环  while循环  do while循环
 * 2 break  continue
 */

public class ForDemo {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            System.out.println(i+" hello.");
        }
        for(int i=0; i<5; i+=2){
            System.out.println(i+" world.");
        }

        int a = 0;
        while(a<3){
            System.out.println("执行 "+a);
            a += 1;
        } //先判断后执行

        int b = 0;
        do{
            System.out.println("执行 "+b);
            b += 1;
        }while (b<3); //先执行后判断
    }
}
