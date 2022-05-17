package view.frame;

import view.Account;
import view.BankManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawalFrame extends JFrame {
    BankManager manager = BankManager.getInstance();
    Label title_label;
    Button submit_btn;

    WithdrawalFrame(Account user) {
        setSize(300, 200);
        Panel p = new Panel();
        p.setBackground(Color.DARK_GRAY);
        p.setLayout(null);

        title_label = new Label("[출금]", Label.CENTER);
        JLabel withdrawal_label = new JLabel("출금 금액을 입력해주세요", JLabel.CENTER);
        JLabel money_label = new JLabel("현재 금액 : " + user.getMoney()+" 원", JLabel.CENTER);
        JTextField withdrawal_money = new JTextField(10);
        submit_btn = new Button("확인");

        title_label.setBounds(85,05,140,30);
        withdrawal_label.setBounds(55,30,200,40);
        money_label.setBounds(55,70,200,30);
        withdrawal_money.setBounds(55,100,200,30);
        submit_btn.setBounds(120,130,70,30);

        p.add(title_label);
        p.add(withdrawal_label);
        p.add(money_label);
        p.add(withdrawal_money);
        p.add(submit_btn);
        add(p);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

        submit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (manager.withdrawal(user, Integer.parseInt(withdrawal_money.getText()))) {
                    JOptionPane.showMessageDialog(null, "출금되었습니다.");
                    new BankSystemFrame(user);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
                }
            }
        });
    }
}
