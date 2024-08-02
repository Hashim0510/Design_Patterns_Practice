package DesignPattern.decarator.notifierAPP.Decarator;

import DesignPattern.decarator.notifierAPP.NotifierInf;

public class WhatsappNotifier implements DecaratorInf {

    NotifierInf notifierInf;

    public WhatsappNotifier(NotifierInf notifierInf) {
        this.notifierInf = notifierInf;
    }

    @Override
    public void send() {

        notifierInf.send();

        System.out.println("WHATSAPP NOTFICATION !!!! ");
    }
}
