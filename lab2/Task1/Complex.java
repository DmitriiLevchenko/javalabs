package lab2.Task1;

import java.text.DecimalFormat;

public class Complex {

    public double getModule(ComplexType complexType) {
        return Math.sqrt(Math.pow(complexType.getImaginaryNumber(), 2) + Math.pow(complexType.getNumber(), 2));
    }

    public double getArg(ComplexType complexType) {
        return Math.atan(complexType.getNumber() / complexType.getImaginaryNumber());
    }

    public ComplexType getSumma(ComplexType complexType1, ComplexType complexType2) {
        return new ComplexType(complexType1.getNumber() + complexType2.getNumber(),
                complexType1.getImaginaryNumber() + complexType2.getImaginaryNumber());
    }

    public ComplexType getDiff(ComplexType complexType1, ComplexType complexType2) {
        return new ComplexType(complexType1.getNumber() - complexType2.getNumber(),
                complexType1.getImaginaryNumber() - complexType2.getImaginaryNumber());
    }

    public ComplexType getMult(ComplexType complexType1, ComplexType complexType2) {
        double number = complexType1.getNumber() * complexType2.getNumber() - complexType1.getImaginaryNumber() * complexType2.getImaginaryNumber();
        double imaginaryNumber = complexType1.getNumber() * complexType1.getImaginaryNumber() + complexType1.getImaginaryNumber() * complexType2.getNumber();
        return new ComplexType(number, imaginaryNumber);
    }

    public ComplexType getDiv(ComplexType complexType1, ComplexType complexType2) {
        ComplexType numerator = this.getMult(complexType1, complexType2);
        ComplexType denumerator = this.getMult(complexType2, complexType2);
        return new ComplexType(numerator.getNumber() / denumerator.getNumber(),
                numerator.getImaginaryNumber() / denumerator.getNumber());
    }
}
