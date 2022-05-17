package view.frame;

import view.Account;
import view.BankManager;

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
        setSize(300, 200);
        JPanel jPanel = new JPanel();

        jPanel.setBackground(Color.PINK);
        jPanel.setLayout(null);
        back_btn = new Button("<- ");
        title_label = new Label("[로그인]");

        JLabel id_label = new JLabel("아이디: ");

        JLabel pw_label = new JLabel("암호: ");

        JTextField id = new JTextField(20);

        JPasswordField password = new JPasswordField(20);

        submit_btn = new Button("확인");

        back_btn.setBounds(20, 20, 50, 30);
        title_label.setBounds(130, 20, 70, 30);
        id_label.setBounds(20, 60, 70, 40);
        id.setBounds(60, 70, 200, 30);
        pw_label.setBounds(20, 90, 150, 40);
        password.setBounds(60, 100, 200, 30);
        submit_btn.setBounds(120, 130, 70, 30);


        jPanel.add(back_btn);
        jPanel.add(title_label);
        jPanel.add(id_label);
        jPanel.add(id);
        jPanel.add(pw_label);
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
