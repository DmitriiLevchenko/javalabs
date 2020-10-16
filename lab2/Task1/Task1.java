//https://github.com/DmitriiLevchenko
package lab2.Task1;

import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");
        ComplexType complexType1 = new ComplexType((double) 4,(double)7);
        ComplexType complexType2 = new ComplexType((double) 6,(double)9);
        complexType1.toString();
        Complex complex = new Complex();
        System.out.println(df.format(complex.getModule(complexType1)));
        System.out.println(df.format(complex.getArg(complexType1)));
        System.out.println(complex.getSumma(complexType1,complexType2));
        System.out.println(complex.getDiff(complexType1,complexType2));
        System.out.println(complex.getMult(complexType1,complexType2));
        System.out.println(complex.getDiv(complexType1,complexType2));
    }
}
