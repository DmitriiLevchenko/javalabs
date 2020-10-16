package lab4.Task1;

import lab4.Task1.factories.GUIFactory;
import lab4.Task1.interfaces.IAutomobile;
import lab4.Task1.interfaces.IMotorcycle;

public class Application {
    private IMotorcycle motorcycle;
    private IAutomobile automobile;
    Application(GUIFactory guiFactory)
    {
        this.motorcycle = guiFactory.createMotorcycle();
        this.automobile = guiFactory.createAutomobile();
    }
    public void createMotorcycle(){
         this.motorcycle.create();
    }
    public void createAutomobile(){
         this.motorcycle.create();
    }
}
