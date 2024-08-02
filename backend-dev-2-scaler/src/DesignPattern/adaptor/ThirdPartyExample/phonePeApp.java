package DesignPattern.adaptor.ThirdPartyExample;

public class phonePeApp {

    AdaptersInterface adaptersInterface;

    public phonePeApp(AdaptersInterface adaptersInterface) {
        this.adaptersInterface = adaptersInterface;
    }

    public void getBalanceForClient(){

        adaptersInterface.getBalance();
    }

    public void addAccountForClient(){

        adaptersInterface.addAccount();
    }
}
