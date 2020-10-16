package lab4.Task1.factories;

import lab4.Task1.interfaces.IAutomobile;
import lab4.Task1.interfaces.IMotorcycle;
import lab4.Task1.models.auto.MersedecAuto;
import lab4.Task1.models.motorcycle.MersedecMotorcycle;

public class MersedecFactory implements GUIFactory{
    @Override
    public IAutomobile createAutomobile() {
        return new MersedecAuto();
    }

    @Override
    public IMotorcycle createMotorcycle() {
        return new MersedecMotorcycle();
    }
}
