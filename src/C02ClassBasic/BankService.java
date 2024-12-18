package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BankService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, BankAccount> accMap = new HashMap<>();
        BankAccount ba;
        StringTokenizer st;
        String acc;
        int money;
        int balance;


//        프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
        loop :
        while(true) {
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
            System.out.println("서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금");
            String service = br.readLine();

            switch (service) {
//        1.개설 : 계좌번호와 현재 가지고 계신 돈을 입력하세요.
                case "1" -> {
                    System.out.println("계좌번호와 현재 가지고 계신 돈을 입력하세요.");
                    st = new StringTokenizer(br.readLine());
                    acc = st.nextToken();
                    money = Integer.parseInt(st.nextToken());
                    ba = new BankAccount(acc, money);
                    accMap.put(acc, ba);
                }


//        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
                case "2" -> {
                    System.out.println("계좌조회서비스입니다. 계좌번호를 입력해주세요.");
                    st = new StringTokenizer(br.readLine());
                    acc = st.nextToken();
                    balance = accMap.get(acc).getBalance();
                    System.out.println("잔고는 " + balance + "원 입니다");
                }

//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
                case "3" -> {
                    System.out.println("계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.");
                    st = new StringTokenizer(br.readLine());
                    acc = st.nextToken();
                    money = Integer.parseInt(st.nextToken());
                    ba = accMap.get(acc);
                    ba.deposit(money);
                    balance = accMap.get(acc).getBalance();
                    System.out.println("입금이 완료되었습니다. 잔고는 " + balance + "원 입니다");
                }

//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증)
                case "4" -> {
                    System.out.println("계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.");
                    st = new StringTokenizer(br.readLine());
                    acc = st.nextToken();
                    money = Integer.parseInt(st.nextToken());
                    ba = accMap.get(acc);
                    if(ba.withdraw(money)){
                        balance = accMap.get(acc).getBalance();
                        System.out.println("출금이 완료되었습니다. 잔고는 " + balance + "원 입니다");
                    }
                }

//        5.송금 : 송금서비스입니다. user1과 user2의 송금금액을 입력해주세요.(잔액검증)
                case "5" -> {
                    System.out.println("계좌송금서비스입니다. 자신의 계좌번호와 보내실 계좌번호, 송금금액을 입력해주세요.");
                    st = new StringTokenizer(br.readLine());
                    String acc1 = st.nextToken();
                    String acc2 = st.nextToken();
                    BankAccount ba1 = accMap.get(acc1);
                    BankAccount ba2 = accMap.get(acc2);
                    money = Integer.parseInt(st.nextToken());
                    ba1.transfer(ba2, money);
                    balance = ba1.getBalance();
                    System.out.println("송금이 완료되었습니다. 잔고는 " + balance + "원 입니다");
                }

//        0.정료 : 이용해 주셔서 감사합니다
                case "0" -> {
                    System.out.println("이용해 주셔서 감사합니다");
                    break loop;
                }

                default -> System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }
        }
    }
}

//Account객체 : 자체ID값(자동 increment), 계좌번호, 잔액 변수로 구성
class BankAccount{
    static long statidId = 0;
    private long id;
    private String accNum;
    private int balance;

    public BankAccount(String accNum, int balance) {
        statidId++;
        this.id = statidId;
        this.balance = balance;
        this.accNum = accNum;
    }

    public void deposit(int money){
        this.balance += money;
    }

    public boolean withdraw(int money){
        if(this.balance < money){
            System.out.println("잔액 부족입니다.");
            return false;
        }else{
            this.balance -= money;
            return true;
        }
    }

    public void transfer(BankAccount ba, int money){
        if(!this.withdraw(money)){
            return;
        }else ba.deposit(money);

    }


    public int getBalance() {
        return this.balance;
    }
}