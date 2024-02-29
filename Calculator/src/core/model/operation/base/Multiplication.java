package core.model.operation.base;

import core.model.impl.Calculable;

public class Multiplication implements Calculable<Double> {
    @Override
    public Double calculation(Double arg1, Double arg2) {
        return arg1 * arg2;
    }
}
