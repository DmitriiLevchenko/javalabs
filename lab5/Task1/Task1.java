package lab5.Task1;

import lab5.Task1.factories.GUIFactory;
import lab5.Task1.factories.NokiaFactory;
import lab5.Task1.factories.SamsungFactory;

public class Task1 {
    private static Application config(){
        GUIFactory factory = new NokiaFactory();
        return new Application(factory);
    }
    public static void main(String[] args) {
        Application application = Task1.config();
        application.call();
    }
}
