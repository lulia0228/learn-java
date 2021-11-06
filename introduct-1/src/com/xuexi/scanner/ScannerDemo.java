package com.xuexi.scanner;

/**
 * 简单案例，调用API实现键盘录入
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt(); //等待用户输入数据
        System.out.println("请输入姓名：");
        String name = sc.next(); //等待用户输入数据

        System.out.println("name is "+name+", age is "+age+".");
    }
}
