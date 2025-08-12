package javaSwing_DBC;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame =new JFrame();
    JLabel label = new JLabel();

    NewWindow(){
        label.setBounds(0,0,100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        label.setText("Hello");

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
