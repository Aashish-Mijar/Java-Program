import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;
import javax.swing.border.Border;
public class BorderLayoutExample {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

       Container c= frame.getContentPane();

       JButton b1 = new JButton("Header");
       JButton b2 = new JButton("Footer");
       JButton b3 = new JButton("Center");
       JButton b4 = new JButton("SidebarLeft");
       JButton b5 = new JButton("SidebarRight");

       c.add(b1, BorderLayout.NORTH);
       c.add(b2, BorderLayout.SOUTH);
       c.add(b3, BorderLayout.CENTER);
       c.add(b4, BorderLayout.WEST);
       c.add(b5, BorderLayout.EAST);

    }
}
