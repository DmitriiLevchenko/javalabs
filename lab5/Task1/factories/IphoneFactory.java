package lab5.Task1.factories;

import lab5.Task1.interfaces.IPhone;
import lab5.Task1.models.IphoneModelPhone;

public class IphoneFactory implements GUIFactory {
    @Override
    public IPhone createPhone() {
        return new IphoneModelPhone();
    }
}
