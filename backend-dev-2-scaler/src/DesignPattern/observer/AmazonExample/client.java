package DesignPattern.observer.AmazonExample;

import DesignPattern.observer.AmazonExample.Events.Mail;
import DesignPattern.observer.AmazonExample.Events.Messages;

public class client {

    public static void main(String[] args) {


        AmazonMain amazonMain = AmazonMain.getInstance();

        Mail mail = new Mail();
        Messages messages = new Messages();

        amazonMain.orderPlaced();
    }


}
