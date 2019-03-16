package stu.calculate.old;

import stu.calculate.AddCalculate;
import stu.calculate.DivCalculate;
import stu.calculate.MulCalculate;
import stu.calculate.SubCalculate;

public class Test {
    
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        String operation = "+";
        double result = 0;
        if(operation.equals("+")) {
            result = new AddCalculate().cal(num1, num2);
        } else if(operation.equals("-")) {
            result = new SubCalculate().cal(num1, num2);
        } else if(operation.equals("*")) {
            result = new MulCalculate().cal(num1, num2);
        } else if(operation.equals("/")) {
            result = new DivCalculate().cal(num1, num2);
        }
        System.out.println(result);
    }

}
