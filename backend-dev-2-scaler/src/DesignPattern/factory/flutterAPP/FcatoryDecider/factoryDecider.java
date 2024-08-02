package DesignPattern.factory.flutterAPP.FcatoryDecider;

import DesignPattern.factory.flutterAPP.Factories.IOSFactory;
import DesignPattern.factory.flutterAPP.Factories.androidFactory;
import DesignPattern.factory.flutterAPP.Factories.factories;
import DesignPattern.factory.flutterAPP.flutterApp.supoortedPlatform;

public class factoryDecider {


    /*
    factory decider class will eliminate the ocp Violation in flutterMain class, but here it is violatiing,
    but its not that much bad,
     */
    public static factories getFactory(supoortedPlatform supoortedPlatform){

        if(supoortedPlatform == DesignPattern.factory.flutterAPP.flutterApp.supoortedPlatform.ANDROID){

            return new androidFactory();
        }

        else if(supoortedPlatform == DesignPattern.factory.flutterAPP.flutterApp.supoortedPlatform.IOS){

            return new IOSFactory();
        }

        return null;

    }
}
