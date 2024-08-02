package DesignPattern.observer.AmazonExample.Events;

import DesignPattern.observer.AmazonExample.AmazonMain;
import DesignPattern.observer.AmazonExample.OrderPlacedEvents;

public class Messages implements OrderPlacedEvents {

    public Messages() {

        AmazonMain amazonMain = AmazonMain.getInstance();

        amazonMain.addOrderPlacedEvents(this);


    }

    @Override
    public void OnOrderPlaced() {
        sendMessage();
    }

    void sendMessage(){

        System.out.println("MESSAGE HAS BEEN SENT !!!!");
    }
}
