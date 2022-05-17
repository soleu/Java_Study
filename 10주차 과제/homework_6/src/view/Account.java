package view;

public class Account {
    private String id;
    private String pwd;

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    private int money;

    public Account(String id2, String pwd2) {
        // TODO Auto-generated constructor stub
        id = id2;
        pwd = pwd2;
    }

    public int getMoney() {
        return money;
    }

    public void deposit(int money) {
        this.money += money;
    }

    public boolean withdrawal(int money) {
        if (this.money < money) return false;
        this.money -= money;
        return true;
    }

}
