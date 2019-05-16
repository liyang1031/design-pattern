package com.example.dp.simple.factory;

/**
 * 计算器抽象类
 * 抽离出公共的方法
 * @author Jason Lee
 */
public abstract class AbstractOperation {
    /**
     *第一个数字
     */
    public Double inParam1;
    /**
     *第二个数字
     */
    public Double inParam2;

    /**
     * 抽象的计算方法
     * @return
     */
    public abstract Double calculate();
}
