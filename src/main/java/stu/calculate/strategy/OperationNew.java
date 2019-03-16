package stu.calculate.strategy;

public class OperationNew {

    private String operation;
    private int num1;
    private int num2;

    public OperationNew(String operation, int num1, int num2) {
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double execute() {
        return CalStrategy.getCalStrategy(operation).cal(num1, num2);
    }

}
