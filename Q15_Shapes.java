// Q15. Shapes on button click
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q15_Shapes extends JFrame implements ActionListener {
    String shape = "";

    Q15_Shapes() {
        setLayout(new FlowLayout());

        JButton b1 = new JButton("Circle");
        JButton b2 = new JButton("Rectangle");

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(b1); add(b2);

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        shape = e.getActionCommand();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if(shape.equals("Circle"))
            g.drawOval(150,150,100,100);
        else if(shape.equals("Rectangle"))
            g.drawRect(150,150,100,100);
    }

    public static void main(String[] args) {
        new Q15_Shapes();
    }
}
