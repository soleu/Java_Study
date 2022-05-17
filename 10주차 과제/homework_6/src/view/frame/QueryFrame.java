package view.frame;

import view.Account;
import view.BankManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QueryFrame extends JFrame {
    BankManager manager = BankManager.getInstance();
    Label title_label;
    Button back_btn;

    QueryFrame(Account user) {
        setSize(300, 200);
        Panel p = new Panel();
        p.setBackground(Color.DARK_GRAY);
        p.setLayout(null);

        back_btn = new Button("<-");
        title_label = new Label("잔액 조회", Label.CENTER);
        JLabel money_label = new JLabel("현재 금액 : " + user.getMoney()+" 원", JLabel.CENTER);

        title_label.setBounds(85,05,140,30);
        back_btn.setBounds(20, 20, 50, 30);
        title_label.setBounds(55, 20, 200, 40);
        money_label.setBounds(55, 80, 200, 30);


        p.add(back_btn);
        p.add(title_label);
        p.add(money_label);
        add(p);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

        back_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BankSystemFrame(user);
                setVisible(false);
            }
        });
    }
}
