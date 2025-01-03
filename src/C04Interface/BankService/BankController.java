package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        while(true){
            System.out.println("입급 : 1, 출금 : 2");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("입금하실 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("입금 방식을 선택해주세요. 1.카드 2.카카오페이");
                String input2 = sc.nextLine();
                BankService bs;
                if(input2.equals("1")){
//                    카드 서비스 객체 생성
                    bs = new BankCardService();
                    bs.deposit(money, ba);
                }else{
//                    카카오 서비스 객체 생성
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);
                }
            }else{
                System.out.println("출금하실 금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("출금 방식을 선택해주세요. 1.카드 2.카카오페이");
                String input2 = sc.nextLine();
                BankService bs;
                if(input2.equals("1")){
//                    카드 서비스 객체 생성
                     bs = new BankCardService();
                    bs.withdraw(money, ba);
                }else{
//                    카카오 서비스 객체 생성
                    bs = new BankKakaoService();
                    bs.withdraw(money, ba);
                }
            }
        }
    }
}
