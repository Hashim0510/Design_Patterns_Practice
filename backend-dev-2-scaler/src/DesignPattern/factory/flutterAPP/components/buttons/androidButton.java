package DesignPattern.factory.flutterAPP.components.buttons;

public class androidButton implements button{
    @Override
    public void changeSize() {
        System.out.println("ANDROID BUTTON");
    }
}
