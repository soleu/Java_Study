package view;

import java.util.ArrayList;
import java.util.Scanner;

public class BankManager {
    private static BankManager instance = new BankManager();
    private ArrayList<Account> accounts;

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    private BankManager() {
        accounts = new ArrayList<Account>();
    }

    public static BankManager getInstance() {
        return instance;
    }

    public int showMenu() {
        System.out.println("=========[고객 관리]=========");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("===========================");
        System.out.print("입력 : ");

        int choice = sc.nextInt();
        return choice;
    }

    public int showBankMenu() {
        System.out.println("=========[계좌 관리]=========");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 잔액 확인");
        System.out.println("4. 로그아웃");
        System.out.println("===========================");
        System.out.print("입력 : ");

        int choice = sc.nextInt();
        return choice;
    }

    public boolean isExistedId(String id) {
        for (Account account : accounts) {
            if (account.getId().equals(id)) {
                System.out.println("중복된 아이디입니다.");
                return true;
            }
        }
        return false;
    }

    public void join(String id, String pwd) {
        accounts.add(new Account(id, pwd));
    }

    public Account login(String id, String pwd) {
        for (Account a : accounts)
            if (a.getId().equals(id) && a.getPwd().equals(pwd))
                return a;
        return null;
    }

    public void deposit(Account acc, int money) {
        acc.deposit(money);
    }

    public boolean withdrawal(Account acc, int money) {
        boolean succeeded = acc.withdrawal(money);
        return succeeded;
    }

    public int query(Account acc) {
        return acc.getMoney();
    }
}
