package EventHandling;

import javax.swing.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Click Demo");
        JButton button = new JButton("Click me");

        // ActionListener for button click
        button.addActionListener((java.awt.event.ActionListener) new ActionListenerExample(){
        
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Button was clicked");
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
