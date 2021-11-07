package com.xuexi.String_;

/**
 * java.lang.String  常用的api
 * 1. equals  判断字符串值相等
 * 2. length  获取长度
 * 3. charAt  获取字符
 * 4. toCharArray 转化成字符数组
 * 5. substring 字符串截取
 * 6. replace 替换
 * 7. contains 判断是否包含字符串
 * 8. startsWith 判断是否以什么开始
 * 9. split 分割字符串
 */

public class StringAPI {
    public static void main(String[] args) {

        String s1 = "abc123";
        String s2 = "ABC123";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));

        char[] arr1 = s1.toCharArray();
        for (char c : arr1) {
            System.out.println(c);
        }

        String s3 = s1.substring(2,5);
        System.out.println(s3);

        String s4 = s1.replace("bc", "**");
        System.out.println(s4);

        boolean bl = s1.contains("bc1");
        System.out.println(bl);

        System.out.println(s1.startsWith("abc"));

        String names = "张三，李四，王五";
        String[] s_arr = names.split("，");
        for (String s : s_arr) {
            System.out.println(s);
        }


    }
}
