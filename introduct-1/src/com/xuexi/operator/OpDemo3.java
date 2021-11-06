package com.xuexi.operator;

/**
 * 3 自增自减运算符
 * (1)单独使用的时候，放在变量前和变量后作用一致.
 * (2)不单独使用时候，表达式的值不一样，变量都会+1。
 */

public class OpDemo3 {
    public static void main(String[] args) {
        int a = 10;
        //a++;
        ++a;
        System.out.println(a);

        int b = 100;
        int c = b++;
        System.out.println(b); //101
        System.out.println(c); //100

        int d = 100;
        int e = ++d;
        System.out.println(d); //101
        System.out.println(e); //101

        System.out.println("-----拓展案例-----");
        int k=3, p=5;
        int rs = k++ + ++k - --p + p-- -k-- + ++p + 2;
        //       3   + 5   - 4   + 4   -5   + 4   + 2
        System.out.println(k);
        System.out.println(p);
        System.out.println(rs);


    }
}
