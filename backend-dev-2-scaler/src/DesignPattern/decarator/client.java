package DesignPattern.decarator;

import DesignPattern.decarator.notifierAPP.Decarator.WhatsappNotifier;
import DesignPattern.decarator.notifierAPP.Decarator.emailNotifier;
import DesignPattern.decarator.notifierAPP.NotifierInf;
import DesignPattern.decarator.notifierAPP.BasicSmsNotifier;

public class client {

    public static void main(String[] args) {

        /*

        Decarator design pattern is used to add extra functionalities of other objects whichever we want
        to the base object
         */

        notifyTheUser();
    }

    static void notifyTheUser(){


        //creating BasicSmsNotifier object to call the base notificaion
        NotifierInf notifierInf = new BasicSmsNotifier();

//        notifierInf.send();


        //adding extra features to the existing NotifierInf object by sending its object to WhatsappNotifier class
        //now it can be able to utilize BasicSmsNotifier's functionality and WhatsappNotifier's functionality
        notifierInf = new WhatsappNotifier(notifierInf);

//        notifierInf.send();

        notifierInf = new emailNotifier(notifierInf);

        notifierInf.send();



    }
}