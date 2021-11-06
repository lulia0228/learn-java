package com.xuexi.condition;

/**
 * 1 if 条件句
 * 3种用法   if(){}  if(){}else{} if(){}else if{}else{}
 */

public class IfDemo {
    public static void main(String[] args) {
        double count = 5999;
        if(count>1314){
            System.out.println("本次红包发送成功。");
        } else{
            System.out.println("余额不足，无法发送红包。");
        }
    }
}
