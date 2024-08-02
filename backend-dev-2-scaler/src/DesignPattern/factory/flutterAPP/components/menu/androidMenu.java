package DesignPattern.factory.flutterAPP.components.menu;

import DesignPattern.factory.flutterAPP.components.buttons.button;

public class androidMenu implements menu {
    @Override
    public void changeModel() {
        System.out.println("ANDROID MENU");
    }
}
