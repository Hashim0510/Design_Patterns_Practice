package DesignPattern.adaptor.ThirdPartyExample;

public class HDFCbankAdapter implements AdaptersInterface{


    HDFCBankApi hdfcBankApi;

    public HDFCbankAdapter(){

    }
    public HDFCbankAdapter(HDFCBankApi hdfcBankApi) {
        this.hdfcBankApi = hdfcBankApi;
    }

    @Override
    public void getBalance() {
        System.out.println("HDFC BANK ADAPTER GET BALANCE");
        hdfcBankApi.fetchBalance();
    }

    @Override
    public void addAccount() {

        System.out.println("HDFC BANK ADAPTER ADD ACCOUNT");
        hdfcBankApi.addingAccount();

    }
}
