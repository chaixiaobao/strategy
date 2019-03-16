package stu.calculate.strategy;

public class Test {
    
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        String operation = "*";
        double result = CalStrategy.getCalStrategy(operation).cal(num1, num2);
        System.out.println(result);
    }

}
