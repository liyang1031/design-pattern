package com.example.dp.simple.factory;

/**
 * 除法计算类
 * @author Jason.Lee
 */
public class DivOperation extends AbstractOperation{
    /**
     * 重写父类的计算方法
     * @return
     */
    @Override
    public Double calculate() {
        if(inParam2==0){
            System.out.println("除数不能为零");
            return null;
        }
        System.out.println("调用了除法");
        return inParam1/inParam2;
    }
}
