package core.model.operation;

import core.view.impl.Loggable;
import core.model.impl.Calculable;
import core.model.operation.base.*;

import java.util.HashMap;

public class BaseCalculator {
    protected Double result;
    private final Loggable logger;


    public BaseCalculator(Loggable logger) {
        this.logger = logger;
    }

    public Double calculator(char operator, Double num1, Double num2) {
        HashMap<Character, Calculable<Double>> baseMap = new HashMap<>();
        baseMap.put('+', new Addition());
        baseMap.put('-', new Substraction());
        baseMap.put('*', new Multiplication());
        baseMap.put('/', new Division());
        baseMap.put('^', new Exponentiation());

        result = baseMap.get(operator).calculation(num1, num2);
        System.out.printf("First Number: %s, Operation: '%s', Second Number: %s\n", num1, operator, num2);
        System.out.printf("Result = %s\n\n", result);
        logger.log(String.format("%s %s %s = %s\n", num1, operator, num2, result));
        return result;
    }
}
