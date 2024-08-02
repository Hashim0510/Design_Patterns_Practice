package DesignPattern.adaptor.ThirdPartyExample;

import java.util.concurrent.Semaphore;

public class client {

    public static void main(String[] args) {

        //for using HDFC BACK AS A BACNKING PARTNER FOR PHONEPE

        HDFCBankApi hdfcBankApi = new HDFCBankApi();

        HDFCbankAdapter hdfCbankAdapter = new HDFCbankAdapter(hdfcBankApi);

        phonePeApp phonePeApp = new phonePeApp(hdfCbankAdapter);

        phonePeApp.getBalanceForClient();

        phonePeApp.addAccountForClient();


        //for using YES BACK AS A BACNKING PARTNER FOR PHONEPE

        YesbankApi yesbankApi = new YesbankApi();

        YesbankAdapter yesbankAdapter = new YesbankAdapter(yesbankApi);

        DesignPattern.adaptor.ThirdPartyExample.phonePeApp phonePeApp1 = new phonePeApp(yesbankAdapter);

        phonePeApp1.getBalanceForClient();

        phonePeApp1.addAccountForClient();


    }
}
