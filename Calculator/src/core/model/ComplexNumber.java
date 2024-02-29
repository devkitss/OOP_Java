package core.model;

public class ComplexNumber {
    private Double re;
    private Double im;

    public ComplexNumber(Double re, Double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber() {
    }

    public Double getRe() {
        return re;
    }

    public Double getIm() {
        return im;
    }

    public ComplexNumber linkedComplexNumber(ComplexNumber this) {
        return new ComplexNumber(re, im * (-1));
    }

    @Override
    public String toString() {
        if (getIm() == 0) return String.format("%s", re);
        else if (getIm() == 1)
            return String.format("%s + i", re);
        else if (getIm() == -1)
            return String.format("%s - i", re);
        else if (getIm() < 0)
            return String.format("%s %si", re, im);
        else
            return String.format("%s + %si", re, im);
    }
}
