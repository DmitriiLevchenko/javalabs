package lab4.Task1.models.auto;

import lab4.Task1.interfaces.IAutomobile;

public class MazdaAuto implements IAutomobile {
    @Override
    public void create() {
        System.out.println("Create MazdaAuto entity");
    }
}
