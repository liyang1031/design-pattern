package com.example.dp.strategy;

/**
 * 优惠对象,打折
 * @author Jason.Lee
 */
public class CashRebate extends AbstractCashSuper {

    /**
     * 折扣0.0~1
     */
    private double salesNum;

    public CashRebate(String inSalesNum){
        this.salesNum=Double.parseDouble(inSalesNum);
    }

    /**
     * 按折扣价格结算金额
     * @param money
     * @return
     */
    @Override
    public double collectMoney(String money) {
        return salesNum*Double.parseDouble(money);
    }
}
