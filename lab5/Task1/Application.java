package lab5.Task1;

import lab5.Task1.factories.GUIFactory;
import lab5.Task1.interfaces.IPhone;

public class Application {
    private IPhone phone;
    Application(GUIFactory factory){
        this.phone = factory.createPhone();
    }
    public void call(){
        this.phone.call();
    }
}
