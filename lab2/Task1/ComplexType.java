package lab2.Task1;

import java.text.DecimalFormat;

public class ComplexType {
    private final static DecimalFormat df = new DecimalFormat("#.##");
    private double number;
    private double imaginaryNumber;

    public ComplexType(double number, double imaginaryNumber) {
        this.number = number;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    @Override
    public String toString() {
        return ComplexType.df.format(number) + "  " + ComplexType.df.format(imaginaryNumber) + "i";
    }
}
