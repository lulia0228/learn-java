package com.xuexi.condition;

/**
 * switch条件句  switch(表达式){ case 1: ...; case 2: ...; default: ...;}
 * 先执行表达式的值，拿这个值去和case后的值匹配，遇到break就跳出分支
 * 如果case后的值都没匹配上，则执行default代码
 * 注意：
 * （1）表达式类型只能是 byte short int char String 枚举；不能是浮点数
 * （2）case后的值不能重复，且不可是变量
 * （3）不要忘记写break,否则会一直往下走引起bug;当然也可以利用这个特性，特殊使用合并分支
 */

public class SwitchDemo {
    public static void main(String[] args) {
        String weekday = "周五";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干");
                break;
            case "周二":
                System.out.println("请教大师问题");
                break;
            case "周三":
                System.out.println("汇报工作");
                break;
            case "周四":
                System.out.println("吃烤肉去");
                break;
            case "周五":
                System.out.println("愉快迎接周末");
                break;
            case "周六":
                System.out.println("去相亲");
                break;
            default :
                System.out.println("一想到下周上班，有点郁郁寡欢");
                break;
        }
    }
}
