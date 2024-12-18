package C04Interface.BankService;

public class BankCardService implements BankService{
    public BankCardService() {
    }

//    입금시 : xx원 카드로 입급되었습니다.
//    현재 잔액은 yy원 입니다.
    @Override
    public void deposit(int money, BankAccount ba) {
        ba.updateBalance(money + ba.getBalance());
        System.out.println(money + "원 카드로 입금되었습니다");
        System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다");
    }

//    입금시 : xx원 카드로 출급되었습니다.
//    현재 잔액은 yy원 입니다.
    @Override
    public void withdraw(int money, BankAccount ba) {
        if(money > ba.getBalance()){
            System.out.println("잔고가 부족합니다");
            return;
        }
        ba.updateBalance(ba.getBalance() - money);
        System.out.println(money + "원 카드로 출급되었습니다");
        System.out.println("현재 잔액은 " + ba.getBalance() + "원 입니다");
    }
}
