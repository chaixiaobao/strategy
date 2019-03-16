package stu.calculate.strategy;

public class Test {
    
    public static void main(String[] args) {
        OperationNew operation = new OperationNew("*", 2, 3);
        double result = operation.execute();
        System.out.println(result);
    }

}
