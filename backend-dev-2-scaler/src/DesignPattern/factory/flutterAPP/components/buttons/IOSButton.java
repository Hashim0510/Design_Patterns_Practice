package DesignPattern.factory.flutterAPP.components.buttons;

public class IOSButton implements button{
    @Override
    public void changeSize() {
        System.out.println("IOS BUTTON");
    }
}
