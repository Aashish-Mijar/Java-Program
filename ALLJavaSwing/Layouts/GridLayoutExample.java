import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        GridLayout g = new GridLayout(2, 3);
        frame.setLayout(g);
        
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 1"));
    }
}
