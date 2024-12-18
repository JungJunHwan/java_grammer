package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private int balance;

//    생성자
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void updateBalance(int balance){
        this.balance = balance;
    }


//    getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
