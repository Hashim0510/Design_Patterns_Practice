package DesignPattern.factory.flutterAPP.Factories;

import DesignPattern.factory.flutterAPP.components.buttons.IOSButton;
import DesignPattern.factory.flutterAPP.components.buttons.androidButton;
import DesignPattern.factory.flutterAPP.components.buttons.button;
import DesignPattern.factory.flutterAPP.components.menu.IOSMenu;
import DesignPattern.factory.flutterAPP.components.menu.androidMenu;
import DesignPattern.factory.flutterAPP.components.menu.menu;

public class IOSFactory implements factories{
    @Override
    public button createButton() {
        return new IOSButton();
    }

    @Override
    public menu createMenu() {
        return new IOSMenu();
    }
}
