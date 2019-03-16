package stu.calculate.strategy;

import java.util.HashMap;
import java.util.Map;

import stu.calculate.AddCalculate;
import stu.calculate.Calculate;
import stu.calculate.DivCalculate;
import stu.calculate.MulCalculate;
import stu.calculate.SubCalculate;

public class CalStrategy {

    private static Map<String, Calculate> calMap = new HashMap<String, Calculate>();

    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";

    static {
        calMap.put(ADD, new AddCalculate());
        calMap.put(SUB, new SubCalculate());
        calMap.put(MUL, new MulCalculate());
        calMap.put(DIV, new DivCalculate());
    }

    public static Calculate getCalStrategy(String operation) {
        if (!calMap.containsKey(operation)) {
            throw new RuntimeException("不支持的运算符：'" + operation + "'");
        }
        return calMap.get(operation);
    }
}
