// Q16. Simple paint
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q16_Paint extends JFrame {
    int x, y;

    Q16_Paint() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 5, 5);
    }

    public static void main(String[] args) {
        new Q16_Paint();
    }
}
