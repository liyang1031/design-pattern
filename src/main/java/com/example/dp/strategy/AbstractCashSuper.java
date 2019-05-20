package com.example.dp.strategy;

/**
 * 优惠抽象类
 * @author Jason.Lee
 */
public abstract class AbstractCashSuper {
    /**
     * 结账抽象方法
     * @param money
     * @return
     */
    public abstract double collectMoney(String money);
}
