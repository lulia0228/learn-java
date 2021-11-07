package com.xuexi.puchaseBucket;

import java.util.Scanner;

public class shopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while (true) {
            System.out.println("请输入以下命令执行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算支付购物车商品：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入命令：");
            String command = sc.next();
            switch (command){
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("命令不正确。");
            }
        }
    }

    public static void payGoods(Goods[] shopCar) {
        double sum_pay = 0;
        for (Goods g : shopCar) {
            if(g!=null){
                sum_pay += g.buyNumber*g.price;
            }else{
                break;
            }
        }
        System.out.println("购物车结算总金额为："+sum_pay);
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        while (true) {
            System.out.println("请输入要修改的商品的ID");
            int id = sc.nextInt();
            Goods temp_g = getGoodsById(shopCar, id);
            if(temp_g==null){
                System.out.println("您的购物车中没有这个商品。");
            }else{
                System.out.println("请输入商品"+temp_g.name+"的最新购买数量");
                temp_g.buyNumber = sc.nextInt();
                System.out.println("本次修改已完成");
                queryGoods(shopCar);
                break;
            }
        }

    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (Goods g : shopCar) {
            if(g!=null){
                if(g.id==id){
                    return g;
                }
            }else{
                return null; //找完了前面商品，没发现要修改的商品
            }
        }
        return null;
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("购物车信息如下：");
        System.out.println("编号\t\t名称\t\t数量\t\t单价");
        for (Goods g : shopCar) {
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.buyNumber + "\t\t" + g.price);
            } else {
                break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
        //1.录入购买信息
        System.out.println("请输入商品ID");
        int id = sc.nextInt();
        System.out.println("请输入商品名称");
        String name = sc.next();
        System.out.println("请输入商品数量");
        int buyNumber = sc.nextInt();
        System.out.println("请输入商品单价");
        double price = sc.nextDouble();

        //2.生成商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i] == null){
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("您添加的商品:"+g.name+"已经放进购物车。");
    }
}
