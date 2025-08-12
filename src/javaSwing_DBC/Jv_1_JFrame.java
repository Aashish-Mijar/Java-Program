package javaSwing_DBC;

import javax.swing.*;
import java.awt.*;
class frame1 extends JFrame{
    frame1(){
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from being resized

        this.setSize(420, 420); // sets the x and y dimensions
        this.setVisible(true); // make frame visible
//        frame.getContentPane().setBackground(Color.black); // for background color
        this.getContentPane().setBackground(new Color(123,50,212));

        ImageIcon image=new ImageIcon("src/javaSwing_DBC/logo.png");
        this.setIconImage(image.getImage());
    }
}
public class Jv_1_JFrame {
    public static void main(String[] args) {
//         JFrame = a GUI window to add components to
        /*
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized

        frame.setSize(420, 420); // sets the x and y dimensions
        frame.setVisible(true); // make frame visible
//        frame.getContentPane().setBackground(Color.black); // for background color
        frame.getContentPane().setBackground(new Color(123,50,212));

        ImageIcon image=new ImageIcon("src/javaSwing_DBC/logo.png");
        frame.setIconImage(image.getImage());

         */
        frame1 MyFrame=new frame1();

    }
}
