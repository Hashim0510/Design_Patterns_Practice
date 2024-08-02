package DesignPattern.decarator.notifierAPP;

public class BasicSmsNotifier implements NotifierInf{



    //it is the base notification, it will be called compulsorily, if client wants other type of notifications, they can add whatever they want
    @Override
    public void send() {
        System.out.println("SMS NOTFICATION !!!! ");
    }
}
