package view.frame;

import view.Account;
import view.BankManager;
import view.FrameMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInFrame extends JFrame {
    BankManager bankManager = BankManager.getInstance();
    Button back_btn, submit_btn;
    Label title_label;

    SignInFrame() {
        super("로그인");
        JPanel jPanel = new JPanel();

        jPanel.setBackground(Color.BLUE);

        back_btn = new Button("<- ");
        title_label = new Label("[회원가입]", Label.CENTER);

        JLabel label1 = new JLabel("아이디: ", JLabel.CENTER);

        JLabel label2 = new JLabel("암호: ", JLabel.CENTER);

        JTextField id = new JTextField(10);

        JPasswordField password = new JPasswordField(10);

        submit_btn = new Button("확인");

        setSize(300, 200);

        jPanel.add(back_btn);
        jPanel.add(title_label);
        jPanel.add(label1);
        jPanel.add(id);
        jPanel.add(label2);
        jPanel.add(password);
        jPanel.add(submit_btn);
        add(jPanel);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

        back_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FrameMain("은행 시스템");
                setVisible(false);
            }
        });

        submit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Account loginUser = bankManager.login(id.getText(), String.valueOf(password.getPassword()));
                if (loginUser == null) {
                    JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 일치하지 않습니다.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "환영합니다." + loginUser.getId() + "님");
                    new BankSystemFrame(loginUser);
                    setVisible(false);
                }
            }
        });
    }
}
