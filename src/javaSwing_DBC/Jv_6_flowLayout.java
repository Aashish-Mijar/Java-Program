package javaSwing_DBC;

import javax.swing.*;
import java.awt.*;

public class Jv_6_flowLayout {
    public static void main(String[] args) {
//        layout manager= Defines the natural layout for components within a container
//        FlowLayout    = places components in a row, sized at their preferred size.
//                          if the horizontal space in the container is too small, the flowlayout class uses the next available row.

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,23,23));

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
//        JButton button1=new JButton();
//        frame.add(button1);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
