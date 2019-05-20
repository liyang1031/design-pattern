package com.example.dp.strategy;

import java.util.Scanner;

/**
 * 启动类
 * @author Jason.Lee
 */
public class SalesApplication {

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入活动,满减/打折/正常价格");
        String type=scanner.next();
        CashContext context=new CashContext(type);
        System.out.println("请输入金额");
        String money=scanner.next();
        System.out.println("实际付款:"+context.getResult(money));
    }
}
