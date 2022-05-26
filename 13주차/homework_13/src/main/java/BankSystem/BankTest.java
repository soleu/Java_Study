package BankSystem;


public class BankTest {
    public static void main(String[] args) {
        BankManager manager = BankManager.getInstance();
        do {
            int choice = manager.showMenu();
            switch (choice) {
                case 1: //Join
                    manager.join();
                    break;
                case 2: //Login
                    Account acc = manager.login();
                    if (acc != null) {
                        System.out.println("logIn success!!!");
                        int sel;
                        do {
                            sel = manager.showBankMenu();
                            switch (sel) {
                                case 1: // 입금
                                    manager.deposit(acc);
                                    break;
                                case 2: // 출금
                                    manager.withdrawal(acc);
                                    break;
                                case 3: // 잔액 확인
                                    manager.query(acc);
                                    break;
                                case 4: // logout
                                    break;
                            }

                        } while (sel != 4);
                    } else
                        System.out.println("logIn Fail!!!");
                    break;
                case 3:
                    return;
                default:

            }
        } while (true);
    }

}


