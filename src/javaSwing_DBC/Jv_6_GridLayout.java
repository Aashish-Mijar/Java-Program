package javaSwing_DBC;

import javax.swing.*;
import java.awt.*;

public class Jv_6_GridLayout {
    public static void main(String[] args) {
//        Layout Manager = Defines the natural layout for components within a container
//     GridLayout=  places components in a grid of cells
//                  Each components takes all the available space within its cell
//                   and each cell is the same size

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.setLayout(new GridLayout(3,1, 5,5));

//        JButton button = new JButton("1");
//        frame.add(button);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.setVisible(true);


    }
}
