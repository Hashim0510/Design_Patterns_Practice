package DesignPattern.factory.flutterAPP.flutterApp;

import DesignPattern.factory.flutterAPP.Factories.IOSFactory;
import DesignPattern.factory.flutterAPP.Factories.androidFactory;
import DesignPattern.factory.flutterAPP.Factories.factories;
import DesignPattern.factory.flutterAPP.FcatoryDecider.factoryDecider;

public class flutterMain {

    supoortedPlatform supoortedPlatform;


    //getting supported platform value from client to proceed with which platform to perform the UI functionalities
    public flutterMain(supoortedPlatform supoortedPlatform) {
        this.supoortedPlatform = supoortedPlatform;
    }


    //some common methods to be accessible by all the platforms
    public void bacgroundColor(){

        System.out.println("common color option changing to all platfromss");
    }

    /*
    we will have some commom methods for all the platforms but implementation will be different
    so we are designing in that way to put all methods related to one platform in one class, and so on for
    all the platforms...

    before doing that, we need an actual class structure of those implements(which is under componenets package),
    to call all methods related to one platform, we are organinsing in that way to get them all in one object
    (ie., android factory class, IOSFactory class, etc.,)

    To pass the actual factory class's object from client to flutter app, we are having decisive structure of
    coding to decide that, thats why below function getFactory will be needed


     */

//    public factories getFactory(){
//
//        if(supoortedPlatform == DesignPattern.factory.flutterAPP.flutterApp.supoortedPlatform.ANDROID){
//
//            return new androidFactory();
//        }
//
//        else if(supoortedPlatform == DesignPattern.factory.flutterAPP.flutterApp.supoortedPlatform.IOS){
//
//            return new IOSFactory();
//        }
//
//        return null;
//
//    }

    /*
    but the flutterMain class is violating OCP principle becuase it mwy be modifyable in future...

    so that, we want to have it in separate in class which should be modifyable, in some cases violating principles
    are not bad

     */

    public factories getFactory(){

        return factoryDecider.getFactory(supoortedPlatform);

    }






}
