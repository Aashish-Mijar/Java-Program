package EventHandling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import org.w3c.dom.events.MouseEvent;

public class MouseEventExample {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Demo");
        JLabel label = new JLabel("Hover or click here!");

        label.addMouseListener(new MouseAdapter() { // extends MouseListener
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
            

            public void mouseEntered(MouseEvent e) {
                label.setForeground(Color.RED);
            }

            public void mouseExited(MouseEvent e) {
                label.setForeground(Color.BLACK);
            }
        });

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
