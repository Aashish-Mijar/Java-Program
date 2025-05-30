package javaSwing_DBC;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Jv_2_JLabel {
    public static void main(String[] args) {
//         JLabel= a GUI display area for a string of text, an image, or both
        ImageIcon image=new ImageIcon("src/javaSwing_DBC/logo.png");
        Border border= BorderFactory.createLineBorder(Color.green, 3);
        JLabel label=new JLabel();

        label.setText("Do you code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT fo image
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FFF0)); // set font color of text
        label.setFont(new Font("My Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-65); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // sets border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
//        label.setBounds(100, 100, 350, 450); // set x, y position within frame as well as dimensions

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}
