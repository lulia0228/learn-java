package com.xuexi.String_;

public class StringDemo1 {
    public static void main(String[] args) {
        //1. 创建字符串的方式
        String s1 = "我爱中国";
        System.out.println(s1);

        //一般不这么用
        String s2 = new String();
        System.out.println(s2);

        //一般不这么用
        String s3 = new String("天气好");
        System.out.println(s3);

        char[] chars = {'a', 'b', 'c', '1', '2'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {97, 98, 99, 65, 66};
        String s5 = new String(bytes);
        System.out.println(s5);

        //2. 创建方式不同，存放地址有差异
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2);

        char[] my_chs = {'a', 'b', 'c'};
        String ss3 = new String(my_chs);
        String ss4 = new String(my_chs);
        System.out.println(ss3 == ss4);
        System.out.println(ss3.equals(ss4));

    }
}
