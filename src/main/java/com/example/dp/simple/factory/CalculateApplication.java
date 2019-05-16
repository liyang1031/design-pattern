package com.example.dp.simple.factory;
import java.util.Scanner;

/**
 * 计算器主方法
 */
public class CalculateApplication {
    /**
     *入口
     * @param args
     */
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字");
            Double param1 = scanner.nextDouble();
            System.out.println("请输入计算符号");
            String symbol = scanner.next();
            System.out.println("请输入第二个数字");
            Double param2 = scanner.nextDouble();
            AbstractOperation operation = OperationFactory.getOperation(symbol);
            if (operation != null) {
                operation.inParam1 = param1;
                operation.inParam2 = param2;
                System.out.println(String.format("%s%s%s=%s", param1, symbol, param2, operation.calculate()));
            }
        }
    }
}
