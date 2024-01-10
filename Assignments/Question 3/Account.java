public class Account {
    private String accountNo;
    private Name AccountName;

    private double balance;

    Account(){}

    Account(String accountNo, Name AccountName, double balance){
        this.accountNo = accountNo;
        this.AccountName = AccountName;
        this.balance = balance;
    }

    public void setAccountName(Name accountName) {
        AccountName = accountName;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Name getAccountName() {
        return AccountName;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public double getBalance() {
        return balance;
    }

    
    public String toString() {
       
        return "" + accountNo + " " + AccountName + " " + balance;
    }
}
