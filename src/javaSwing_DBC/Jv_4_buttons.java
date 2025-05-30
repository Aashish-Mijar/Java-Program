package javaSwing_DBC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame {
    JButton button;
    JLabel label;

    myFrame(){
        ImageIcon icon=new ImageIcon("src/javaSwing_DBC/emj.png");

        button=new JButton();
        button.setBounds(200, 100, 200, 100);
//        button.addActionListener(e -> System.out.println("Hello"));
        button.setText("I am button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

//    @Override
//    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==button){
//            System.out.println("Hello!");
//        }
//    }
}
public class Jv_4_buttons {
    public static void main(String[] args) {
        myFrame mF=new myFrame();

    }
}
