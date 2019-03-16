package stu.calculate.old;

import stu.calculate.AddCalculate;
import stu.calculate.DivCalculate;
import stu.calculate.MulCalculate;
import stu.calculate.SubCalculate;

public class OperationOld {

    private String operation;
    private int num1;
    private int num2;

    public OperationOld(String operation, int num1, int num2) {
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double execute() {
        double result = 0;
        if (operation.equals("+")) {
            result = new AddCalculate().cal(num1, num2);
        } else if (operation.equals("-")) {
            result = new SubCalculate().cal(num1, num2);
        } else if (operation.equals("*")) {
            result = new MulCalculate().cal(num1, num2);
        } else if (operation.equals("/")) {
            result = new DivCalculate().cal(num1, num2);
        }
        return result;
    }

}
