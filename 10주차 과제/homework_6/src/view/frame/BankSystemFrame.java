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
        Panel p = new Panel();
        p.setBackground(Color.PINK);
        String input_placeholder="";
        title_label = new Label("[은행 시스템] - 고객 관리", Label.CENTER);

        deposit_btn=new Button("[입금하기]");
        withdrawal_btn=new Button("[출금하기]");
        query_btn=new Button("[잔액조회]");
        logout_btn=new Button("[로그아웃]");

        JLabel label1 = new JLabel(input_placeholder, JLabel.CENTER);
        JTextField id = new JTextField(10);

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
        setSize(300, 200);
        setVisible(true);

        deposit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
