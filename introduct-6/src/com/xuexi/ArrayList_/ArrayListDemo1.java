package com.xuexi.ArrayList_;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //尖括号表示泛型
        ArrayList<String> list = new ArrayList();
        list.add("abc");
        list.add("def");
        System.out.println(list);
        list.add(1,"ghi");
        System.out.println(list);
    }
}
