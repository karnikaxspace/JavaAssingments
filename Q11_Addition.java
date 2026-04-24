// Q11. Swing addition
import javax.swing.*;
import java.awt.event.*;

public class Q11_Addition extends JFrame {
    JTextField t1, t2, t3;
    JButton b;

    Q11_Addition() {
        setLayout(null);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b = new JButton("Add");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(50, 100, 100, 30);
        t3.setBounds(50, 150, 100, 30);
        b.setBounds(50, 200, 100, 30);

        add(t1); add(t2); add(t3); add(b);

        b.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b1 = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a + b1));
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q11_Addition();
    }
}
