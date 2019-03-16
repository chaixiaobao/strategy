package stu.calculate.old;

public class Test {
    
    public static void main(String[] args) {
        OperationOld operation = new OperationOld("*", 2, 3);
        double result = operation.execute();
        System.out.println(result);
    }

}
