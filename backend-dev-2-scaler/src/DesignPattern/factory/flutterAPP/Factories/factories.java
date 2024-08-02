package DesignPattern.factory.flutterAPP.Factories;

import DesignPattern.factory.flutterAPP.components.buttons.button;
import DesignPattern.factory.flutterAPP.components.menu.menu;

public interface factories {

    button createButton();
    menu createMenu();
}
