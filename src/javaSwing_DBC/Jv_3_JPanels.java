package javaSwing_DBC;

import javax.swing.*;
import java.awt.*;

public class Jv_3_JPanels {
    public static void main(String[] args) {
        // JPanels = a GUI components that functions as a container to hold other components

        ImageIcon image=new ImageIcon("src/javaSwing_DBC/emj.png");

        JLabel label=new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75,75);

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 160, 160);
        redPanel.setLayout(null);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(160, 0, 160, 160);
        bluePanel.setLayout(null);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 160, 320, 160);
        greenPanel.setLayout(null);

        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        bluePanel.add(label);


        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
