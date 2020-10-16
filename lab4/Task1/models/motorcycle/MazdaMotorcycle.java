package lab4.Task1.models.motorcycle;

import lab4.Task1.interfaces.IMotorcycle;

public class MazdaMotorcycle implements IMotorcycle {
    @Override
    public void create() {
        System.out.println("Create MazdaMotorcycle entity");
    }
}
