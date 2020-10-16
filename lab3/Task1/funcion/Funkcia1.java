package lab3.Task1.funcion;

import lab3.Task1.interfaces.Ifunkcia;

public class Funkcia1 implements Ifunkcia {
    @Override
    public double value(double x) {
        return Math.pow(x,3);
    }
}
