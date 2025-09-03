package EventHandling;

import java.awt.event.ItemEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckboxExample {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Demo");
        JCheckBox checkBox = new JCheckBox("Enable Feature");

        checkBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Checkbox checked!");
            } else {
                System.out.println("Checkbox unchecked!");
            }
        });

        frame.add(checkBox);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
