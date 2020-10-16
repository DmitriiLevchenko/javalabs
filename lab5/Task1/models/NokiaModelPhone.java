package lab5.Task1.models;

import lab5.Task1.interfaces.IPhone;

public class NokiaModelPhone implements IPhone {
    @Override
    public void call() {
        System.out.println("Create Nokia entity");
    }
}
