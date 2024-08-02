package DesignPattern.factory;

import DesignPattern.factory.flutterAPP.components.buttons.button;
import DesignPattern.factory.flutterAPP.components.menu.menu;
import DesignPattern.factory.flutterAPP.flutterApp.flutterMain;
import DesignPattern.factory.flutterAPP.flutterApp.supoortedPlatform;


import DesignPattern.factory.flutterAPP.Factories.factories;
public class client {

    /*

    what is factory method design pattern ???

        method should create and return object based on the purpose of that method

        for example :


     */
    public static void main(String[] args) {

        flutterMain flutter = new flutterMain(supoortedPlatform.IOS);

        factories factories = flutter.getFactory();

        button button = factories.createButton();

        menu menu = factories.createMenu();

        button.changeSize();

        menu.changeModel();

    }





}
