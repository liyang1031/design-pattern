package com.example.dp.simple.factory;

/**
 * 乘法计算类
 * @author Jason.Lee
 */
public class MulOperation extends AbstractOperation{
    /**
     * 重写父类计算方法
     * @return
     */
    @Override
    public Double calculate() {
        System.out.println("调用了乘法");
        return inParam1*inParam2;
    }
}
