package view.frame;

import view.Account;
import view.BankManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositFrame extends JFrame {
    BankManager manager = BankManager.getInstance();
    Label title_label;
    Button submit_btn;

    DepositFrame(Account user) {
        setSize(300, 200);
        Panel p = new Panel();
        p.setBackground(Color.PINK);

        title_label = new Label("[은행 시스템] - 계좌 관리", Label.CENTER);
        JLabel deposit_label = new JLabel("입금할 금액을 입력해주세요", JLabel.CENTER);
        JTextField deposit_money = new JTextField(10);
        submit_btn = new Button("확인");

        p.add(title_label);
        p.add(deposit_label);
        p.add(deposit_money);
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
                manager.deposit(user, Integer.parseInt(deposit_money.getText()));
                JOptionPane.showMessageDialog(null, "입금되었습니다.");
                new BankSystemFrame(user);
                setVisible(false);
            }
        });
    }
}
