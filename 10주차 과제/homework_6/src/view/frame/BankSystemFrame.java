package view.frame;

import view.Account;
import view.BankManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankSystemFrame extends JFrame {
    BankManager manager = BankManager.getInstance();
    Label title_label;
    Button deposit_btn,withdrawal_btn,query_btn,logout_btn;

    BankSystemFrame(Account user){
        setSize(300, 200);
        Panel p = new Panel();
        p.setBackground(Color.PINK);
        title_label = new Label("[은행 시스템] - 계좌 관리", Label.CENTER);

        deposit_btn=new Button("[입금하기]");
        withdrawal_btn=new Button("[출금하기]");
        query_btn=new Button("[잔액조회]");
        logout_btn=new Button("[로그아웃]");


        p.add(title_label);
        p.add(deposit_btn);
        p.add(withdrawal_btn);
        p.add(query_btn);
        p.add(logout_btn);
        add(p);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

        deposit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DepositFrame(user);
                setVisible(false);
            }
        });
        withdrawal_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WithdrawalFrame(user);
                setVisible(false);
            }
        });
        query_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QueryFrame(user);
                setVisible(false);
            }
        });
        logout_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameMain("은행 시스템");
                setVisible(false);
            }
        });

    }
}
