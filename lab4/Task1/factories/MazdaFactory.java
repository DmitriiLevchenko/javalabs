package lab4.Task1.factories;

import lab4.Task1.interfaces.IAutomobile;
import lab4.Task1.interfaces.IMotorcycle;
import lab4.Task1.models.auto.MazdaAuto;
import lab4.Task1.models.motorcycle.MazdaMotorcycle;

public class MazdaFactory implements GUIFactory {
    @Override
    public IAutomobile createAutomobile() {
        return new MazdaAuto();
    }

    @Override
    public IMotorcycle createMotorcycle() {
        return new MazdaMotorcycle();
    }
}
