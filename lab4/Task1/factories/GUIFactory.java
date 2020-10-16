package lab4.Task1.factories;

import lab4.Task1.interfaces.IAutomobile;
import lab4.Task1.interfaces.IMotorcycle;

public interface GUIFactory {
    IAutomobile createAutomobile();
    IMotorcycle createMotorcycle();
}
