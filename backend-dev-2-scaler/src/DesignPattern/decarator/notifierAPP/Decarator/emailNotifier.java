package DesignPattern.decarator.notifierAPP.Decarator;

import DesignPattern.decarator.notifierAPP.BasicSmsNotifier;
import DesignPattern.decarator.notifierAPP.NotifierInf;

public class emailNotifier implements DecaratorInf {

    NotifierInf notifierInf;

    public emailNotifier(NotifierInf notifierInf){


      this.notifierInf = notifierInf;

    }
    @Override
    public void send() {
        notifierInf.send();
        System.out.println("EMAIL NOTFICATION !!!! ");
    }
}
