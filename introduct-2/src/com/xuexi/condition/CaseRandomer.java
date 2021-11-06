package com.xuexi.condition;

import java.util.Random;
import java.util.Scanner;

public class CaseRandomer {
    public static void main(String[] args) {
        //1 随机生成一个1~100幸运数字
        Random r = new Random();
        int luckNumber = r.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        //2 构造死循环让用户猜测
        while(true) {
            System.out.println("请输入您的猜测数字（1~100）：");
            int guessNumber = sc.nextInt();

            if (guessNumber > luckNumber) {
                System.out.println("你的猜测大了");
            } else if (guessNumber < luckNumber) {
                System.out.println("你的猜测小了");
            } else {
                System.out.println("恭喜你猜中幸运数字了");
                break; //结束循环
            }
        }

    }
}
