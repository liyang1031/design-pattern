package com.example.dp.simple.factory;

/**
 * 取模计算类
 * @author Jason.Lee
 */
public class ModOperation extends AbstractOperation{
    /**
     * 重写父类计算方法
     * @return
     */
    @Override
    public Double calculate() {
        System.out.println("调用了取模");
        return inParam1%inParam2;
    }
}
