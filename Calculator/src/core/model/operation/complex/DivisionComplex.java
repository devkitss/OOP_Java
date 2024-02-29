package core.model.operation.complex;

import core.view.ConsoleLogger;
import core.model.impl.Calculable;
import core.model.ComplexNumber;
import core.model.operation.ComplexCalculator;

public class DivisionComplex implements Calculable<ComplexNumber> {
    @Override
    public ComplexNumber calculation(ComplexNumber arg1, ComplexNumber arg2) {
        try {
            ComplexCalculator calculator = new ComplexCalculator(new ConsoleLogger());
            ComplexNumber numerator = calculator.complexcalc('*', arg1, arg2.linkedComplexNumber());
            ComplexNumber denominator = calculator.complexcalc('*', arg2, arg2.linkedComplexNumber());
            return new ComplexNumber(numerator.getRe() / denominator.getRe(), numerator.getIm() / denominator.getRe());
        }catch (ArithmeticException ex) {
            throw new ArithmeticException("На нуль делить нельзя!");
        }

    }
}
