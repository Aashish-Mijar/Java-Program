package EventHandling;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListSelectionExample {
     public static void main(String[] args) {
        JFrame frame = new JFrame("List Selection Demo");
        String[] items = {"Apple", "Banana", "Cherry"};
        JList<String> list = new JList<>(items);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { // Avoid double events
                System.out.println("Selected: " + list.getSelectedValue());
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
