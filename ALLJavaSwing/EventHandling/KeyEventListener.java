package EventHandling;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventListener {
 public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Demo");
        JTextField textField = new JTextField(20);

        textField.addKeyListener(new KeyAdapter() { // extends KeyListener
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }
        });

        frame.add(textField);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
