package core.model.operation.complex;

import core.model.impl.Calculable;
import core.model.ComplexNumber;

public class SubstractionComplex implements Calculable<ComplexNumber> {
    @Override
    public ComplexNumber calculation(ComplexNumber arg1, ComplexNumber arg2) {
        Double resultRe = arg1.getRe() - arg2.getRe();
        Double resultIm = arg1.getIm() - arg2.getIm();
        return new ComplexNumber(resultRe, resultIm);
    }
}
