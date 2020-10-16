package lab3.Task1;

import lab3.Task1.interfaces.Ifunkcia;

public class Tablica {
    private Ifunkcia ifunkcia;

    public Tablica(Ifunkcia ifunkcia) {
        this.ifunkcia = ifunkcia;
    }

    void showTable(double xmin, double xmax, int N) {
        for (double i = xmin; i < xmax; i += Math.abs(xmax - xmin) / N) {
            System.out.println("x=" + i + "y=" + this.ifunkcia.value(i));
        }
    }

}
