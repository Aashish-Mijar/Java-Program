package javaSwing_DBC;

import javax.swing.*;

public class Jv_10_JOptionPane{
//    JOptionPane = pop up a standard dialog box that prompts users for a value
//                  or inform them of something.

    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "This is some information", "title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This message is informative", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "404 not found", "", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Might attack by virus", "", JOptionPane.WARNING_MESSAGE);

//        int answer= JOptionPane.showConfirmDialog(null, "Do you code?", "This is the question", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(answer);
//
        //        String name=JOptionPane.showInputDialog("What is your name? ");
//        System.out.println("Hello "+name);

        String[] responses = {"No", "You're awesome", "thank you", "blush"};
        ImageIcon image=new ImageIcon("emj.png");

        JOptionPane.showOptionDialog(null,
                "This is awesome",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                image,
                responses,
                0);

    }
}
