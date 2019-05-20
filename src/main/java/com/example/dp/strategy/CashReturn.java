package com.example.dp.strategy;

/**
 * 优惠对象,满减
 * @author Jason.Lee
 */
public class CashReturn extends AbstractCashSuper {

    /**
     * 活动金额
     */
    private double salesPrice;
    /**
     * 优惠金额
     */
    private double returnMoney;

    /**
     * 构造方法,初始化满减金额
     * @param salesPrice
     * @param returnMoney
     */
    public CashReturn(String salesPrice,String returnMoney){
        this.salesPrice=Double.parseDouble(salesPrice);
        this.returnMoney= Double.parseDouble(returnMoney);
    }

    /**
     * 根据满减金额进行结算
     * @param inMoney
     * @return
     */
    @Override
    public double collectMoney(String inMoney) {
        //判断是否满足满减标准,如果满足扣除优惠金额,否则按全价
        if(Double.parseDouble(inMoney)>=salesPrice){
            return Double.parseDouble(inMoney)-returnMoney;
        }
        return Double.parseDouble(inMoney);
    }
}
