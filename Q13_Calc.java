// Q13. Simple Calculator
import javax.swing.*;
import java.awt.event.*;

public class Q13_Calc extends JFrame {
    JTextField t1, t2, t3;
    JButton add, sub;

    Q13_Calc() {
        setLayout(null);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        add = new JButton("+");
        sub = new JButton("-");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        t3.setBounds(50, 150, 100, 30);
        add.setBounds(170, 50, 50, 30);
        sub.setBounds(170, 100, 50, 30);

        add(t1); add(t2); add(t3); add(add); add(sub);

        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText("" + (a + b));
        });

        sub.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText("" + (a - b));
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q13_Calc();
    }
}
