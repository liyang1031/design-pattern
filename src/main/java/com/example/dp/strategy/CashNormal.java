package com.example.dp.strategy;

/**
 * 优惠对象,正常价
 * @author Jason.Lee
 */
public class CashNormal extends AbstractCashSuper {

    /**
     * 按正常价格结算金额
     * @param money
     * @return
     */
    @Override
    public double collectMoney(String money) {
        return 1*Double.parseDouble(money);
    }
}
