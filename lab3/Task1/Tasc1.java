//https://github.com/DmitriiLevchenko
package lab3.Task1;

import lab3.Task1.funcion.Funkcia1;
import lab3.Task1.funcion.Funkcia2;
import lab3.Task1.funcion.Funkcia3;
import lab3.Task1.interfaces.Ifunkcia;

public class Tasc1 {
    public static void main(String[] args) {
        Ifunkcia fun1 = new Funkcia1();
        Ifunkcia fun2 = new Funkcia2();
        Ifunkcia fun3 = new Funkcia3();

        Tablica tabl1 = new Tablica(fun1);
        Tablica tabl2 = new Tablica(fun2);
        Tablica tabl3 = new Tablica(fun3);

        tabl1.showTable(-10,20,10);
        tabl2.showTable(-10,50,15);
        tabl3.showTable(-30,20,20);
    }
}
