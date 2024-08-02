package DesignPattern.factory.flutterAPP.components.menu;

import DesignPattern.factory.flutterAPP.components.buttons.button;

public class IOSMenu implements menu {
    @Override
    public void changeModel() {
        System.out.println("IOS MENU");
    }
}
