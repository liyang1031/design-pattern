package com.example.dp.simple.factory;

public class OperationFactory {

    /**
     * 获得对象
     *
     * @param symbol
     * @return
     */
    public static AbstractOperation getOperation(String symbol) {
        AbstractOperation operation = null;
        switch (symbol) {
            //加法
            case "+":
                operation = new SumOperation();
                break;
            //减法
            case "-":
                operation = new SubOperation();
                break;
            //乘法
            case "*":
                operation = new MulOperation();
                break;
            //除法
            case "/":
                operation = new DivOperation();
                break;
            //取模
            case "mod":
                operation = new ModOperation();
                break;
            //平方
            case "^":
                operation = new SquOperation();
                break;
            default:
                System.out.println("暂不支持该计算");
        }
        return operation;
    }
}
