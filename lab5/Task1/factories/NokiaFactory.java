package lab5.Task1.factories;

import lab5.Task1.interfaces.IPhone;
import lab5.Task1.models.NokiaModelPhone;

public class NokiaFactory implements GUIFactory {

    @Override
    public IPhone createPhone() {
        return new NokiaModelPhone();
    }
}
