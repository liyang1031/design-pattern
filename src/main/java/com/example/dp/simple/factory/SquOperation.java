package com.example.dp.simple.factory;

/**
 * 平方计算类
 * @author Jason.Lee
 */
public class SquOperation extends AbstractOperation{
    /**
     * 重写父类计算方法
     * @return
     */
    @Override
    public Double calculate() {
        System.out.println("调用了平方");
        return Math.pow(inParam1,inParam2);
    }
}
