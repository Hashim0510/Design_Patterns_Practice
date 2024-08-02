package DesignPattern.observer.AmazonExample.Events;

import DesignPattern.observer.AmazonExample.AmazonMain;
import DesignPattern.observer.AmazonExample.OrderPlacedEvents;

public class Mail implements OrderPlacedEvents {

    public Mail() {

        AmazonMain amazonMain = AmazonMain.getInstance();

        amazonMain.addOrderPlacedEvents(this);


    }

    @Override
    public void OnOrderPlaced() {
        sendMail();
    }

    void sendMail(){

        System.out.println("MAIL HAS BEEN SENT !!!!");
    }
}
