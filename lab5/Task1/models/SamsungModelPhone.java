package lab5.Task1.models;

import lab5.Task1.interfaces.IPhone;

public class SamsungModelPhone implements IPhone {

    @Override
    public void call() {
        System.out.println("Create Samsung entity");
    }
}
