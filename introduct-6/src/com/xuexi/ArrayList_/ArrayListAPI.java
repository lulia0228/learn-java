package com.xuexi.ArrayList_;

/**
 * java ArrayList 中的APIs
 * 1. get 获取某个索引下的值
 * 2. size 获取长度
 * 3. remove 删除元素
 * 4. set 修改索引值
 * 注意：ArrayList泛型不能是基本数据类型例如int，需要是引用类型，例如String,Integer,类对象。
 */

import java.util.ArrayList;

public class ArrayListAPI {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("scala");
        //1. 获取某个索引下的值
        System.out.println(list.get(3));
        //2. 获取大小
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        //3.1 根据索引删除元素(返回索引对应的值)
        System.out.println(list.remove(2));
        System.out.println(list);
        //3.2 根据值删除元素(返回布尔，且有重复时候只删除第一个)
        System.out.println(list.remove("java"));
        System.out.println(list);

        //4. 修改索引值
        list.set(1, "python");
        System.out.println(list);

    }
}
