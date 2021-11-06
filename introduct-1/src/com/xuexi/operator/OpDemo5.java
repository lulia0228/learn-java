package com.xuexi.operator;

/**
 * 5 三目运算符
 */
public class OpDemo5 {
    public static void main(String[] args) {
        double score = 18;
        String rs = score>=60? "通过":"挂科";
        System.out.println(rs);

        int a=100, b=200;
        int mx = a>b? a:b;
        System.out.println(mx);

        int i=10, j=30, k=50;
        int tmp = i>j? i:j;
        int rsMax = tmp>k? tmp:k;
        System.out.println(rsMax);

        int rsMax1 = i>j? (i>k? i:k):(j>k? j:k);//小括号可以去掉
        System.out.println(rsMax1);

    }
}
