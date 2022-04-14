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

    public void join() {
        System.out.println("=========[회원가입]=========");
        String id = "";
        while (true) {
            System.out.print("아이디를 입력해주세요 : ");
            id = sc2.nextLine();
            if (!isExistedId(id)) break;
        }
        System.out.print("비밀번호를 입력해주세요 : ");
        String pwd = sc2.nextLine();
        accounts.add(new Account(id, pwd));
        System.out.println("환영합니다." + id + "님!");
    }

    public Account login() {
        System.out.println("=========[로그인]=========");
        System.out.print("아이디를 입력해주세요 : ");
        String id = sc2.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String pwd = sc2.nextLine();
        for (Account a : accounts)
            if (a.getId().equals(id) && a.getPwd().equals(pwd))
                return a;
        return null;
    }

    public void deposit(Account acc) {
        System.out.println("=========[계좌 입금]=========");
        System.out.println("입금할 금액을 입력해주세요.");
        System.out.print("입력 : ");
        int money = sc.nextInt();
        acc.deposit(money);

        System.out.println("입금되었습니다.");
    }

    public void withdrawal(Account acc) {
        System.out.println("=========[계좌 출금]=========");
        System.out.println("출금할 금액을 입력해주세요.");
        System.out.print("입력 : ");
        int money = sc.nextInt();
        boolean succeeded = acc.withdrawal(money);

        if (!succeeded) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        System.out.println("입금되었습니다.");
    }

    public void query(Account acc) {
        System.out.println("=========[잔액 확인]=========");
        System.out.println("현재 잔액은 " + acc.getMoney() + "원 입니다.");
    }
}
