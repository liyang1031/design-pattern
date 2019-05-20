package com.example.dp.strategy;

/**
 * 决策类
 * @author Jason.Lee
 */
public class CashContext {

    /**
     *
     */
    private AbstractCashSuper cashSuper;

    /**
     *根据传入的类型进行折扣对象的选择
     * @param salesType
     */
    public CashContext(String salesType){
        switch(salesType){
            case "正常价格" :
                cashSuper=new CashNormal();
                break;
            case "折扣" :
                cashSuper=new CashRebate("0.8");
                break;
            case "满减" :
                cashSuper=new CashReturn("300","50");
                break;
        }

    }

    /**
     * 结账结果
     * @param money
     * @return
     */
    public double getResult(String money){
        return cashSuper.collectMoney(money);
    }

}
