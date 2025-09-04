import java.awt.Container;

import javax.swing.*;

public class NullLayoutExample {
    public static void main(String[] args){
        JFrame frame=new JFrame("Null Layout Manager");
        frame.setBounds(300, 200, 500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane(); 
        c.setLayout(null);
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");

        b1.setBounds(20, 20, 80, 30);
        b2.setBounds(120, 20, 80, 30);
        b3.setBounds(220, 20, 80, 30);
        b4.setBounds(20, 100, 80, 30);
        b5.setBounds(120, 100, 80, 30);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
    }    
}
