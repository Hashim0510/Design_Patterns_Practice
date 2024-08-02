package DesignPattern.factory.flutterAPP.Factories;

import DesignPattern.factory.flutterAPP.components.buttons.androidButton;
import DesignPattern.factory.flutterAPP.components.buttons.button;
import DesignPattern.factory.flutterAPP.components.menu.IOSMenu;
import DesignPattern.factory.flutterAPP.components.menu.androidMenu;
import DesignPattern.factory.flutterAPP.components.menu.menu;

public class androidFactory implements factories{
    @Override
    public button createButton() {
        return new androidButton();
    }

    @Override
    public menu createMenu() {
        return new androidMenu();
    }
}
