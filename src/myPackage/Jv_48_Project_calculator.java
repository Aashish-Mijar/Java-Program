import java.util.*;
import javax.swing.JOptionPane;
class Calculator{
}
public class Jv_48_Project_calculator {
    public static void main(String[] args) {
        double number1= Double.parseDouble(JOptionPane.showInputDialog("Enter number1: "));
        double number2=Double.parseDouble(JOptionPane.showInputDialog("Enter number 2: "));
        double min=Math.min(number1, number2);
        double max=Math.max(number1, number2);
//        JOptionPane.showMessageDialog(null, "Numbers are "+number1+","+number2);
        JOptionPane.showMessageDialog(null, "Minimum is "+min);
        JOptionPane.showMessageDialog(null, "Maximum is "+max);

    }
}
