package view.frame;

import view.BankManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame {
    BankManager manager = BankManager.getInstance();
    Button SignUp_btn, SignIn_btn;
    Label title_label;

    public FrameMain(String str) {
        super(str);

        Panel p = new Panel();
        p.setBackground(Color.PINK);
        title_label = new Label("[은행 시스템] - 고객 관리", Label.CENTER);
        SignUp_btn = new Button(" 회원가입 ");
        SignIn_btn = new Button(" 로그인 ");
        setSize(300, 200);

        p.add(title_label);
        p.add(SignUp_btn);
        p.add(SignIn_btn);
        add(p);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        SignUp_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignUpFrame();
                setVisible(false);
            }
        });

        SignIn_btn.addActionListener(new ActionListener() {
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
