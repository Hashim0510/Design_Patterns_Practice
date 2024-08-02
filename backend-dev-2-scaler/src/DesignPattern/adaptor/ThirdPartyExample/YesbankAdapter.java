package DesignPattern.adaptor.ThirdPartyExample;

public class YesbankAdapter implements AdaptersInterface{

    YesbankApi yesbankApi;

    public YesbankAdapter(){

    }

    public YesbankAdapter(YesbankApi yesbankApi) {
        this.yesbankApi = yesbankApi;
    }

    @Override
    public void getBalance() {
        System.out.println("YES BANK ADAPTER GET BALANCE");
        yesbankApi.fetchBalance();
    }

    @Override
    public void addAccount() {

        System.out.println("YES BANK ADAPTER ADD ACCOUNT");
        yesbankApi.addingAccount();
    }
}
