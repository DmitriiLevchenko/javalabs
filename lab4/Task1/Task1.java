//https://github.com/DmitriiLevchenko
package lab4.Task1;

import lab4.Task1.factories.GUIFactory;
import lab4.Task1.factories.MazdaFactory;
import lab4.Task1.factories.MersedecFactory;

public class Task1 {
    private static Application Configurat () {
        Application app;
        GUIFactory factory;
        //factory = new MersedecFactory();
        factory = new MazdaFactory();
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = Task1.Configurat();
        app.createAutomobile();
        app.createMotorcycle();
    }
}
