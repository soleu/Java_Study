package view.frame;

import view.BankManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame {
    BankManager manager = BankManager.getInstance();
    Button signUp_btn, signIn_btn;
    Label title_label;

    public FrameMain(String str) {
        super(str);
        setSize(300, 200);
        setLayout(new BorderLayout());

        Panel p = new Panel();
        p.setBackground(Color.PINK);
        p.setLayout(new GridLayout(3, 1));
        title_label = new Label("[고객 관리]", Label.CENTER);
        signUp_btn = new Button(" 회원가입 ");
        signIn_btn = new Button(" 로그인 ");

        p.add(title_label);
        p.add(signIn_btn);
        p.add(signUp_btn);
        add(p);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

        signUp_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignUpFrame();
                setVisible(false);
            }
        });

        signIn_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignInFrame();
                setVisible(false); // 창 안보이게 하기
            }
        });

    }

    public static void main(String args[]) {
        new FrameMain("은행 시스템");
    }
}
