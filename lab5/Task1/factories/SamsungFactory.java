package lab5.Task1.factories;

import lab5.Task1.interfaces.IPhone;
import lab5.Task1.models.SamsungModelPhone;

public class SamsungFactory  implements GUIFactory{
    @Override
    public IPhone createPhone() {
        return new SamsungModelPhone();
    }
}
