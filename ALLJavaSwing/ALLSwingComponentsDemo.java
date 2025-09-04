import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

 class AllSwingComponentsDemo {
    public static void main(String[] args) {
        // 1. Create the main frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // 2. Create a tabbed pane to organize components
        JTabbedPane tabbedPane = new JTabbedPane();

        // --- TAB 1: Basic Components ---
        JPanel basicPanel = new JPanel(new FlowLayout());
        
        // Button
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));
        
        // Checkbox & Radio Buttons
        JCheckBox checkBox = new JCheckBox("Check Me");
        JRadioButton radio1 = new JRadioButton("Option 1");
        JRadioButton radio2 = new JRadioButton("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        
        // Text Fields
        JTextField textField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollTextArea = new JScrollPane(textArea);
        
        // Combo Box
        String[] options = {"Java", "Python", "C++"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        
        // Slider & Spinner
        JSlider slider = new JSlider(0, 100, 50);
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        
        basicPanel.add(button);
        basicPanel.add(checkBox);
        basicPanel.add(radio1);
        basicPanel.add(radio2);
        basicPanel.add(new JLabel("Text:"));
        basicPanel.add(textField);
        basicPanel.add(new JLabel("Password:"));
        basicPanel.add(passwordField);
        basicPanel.add(new JLabel("Text Area:"));
        basicPanel.add(scrollTextArea);
        basicPanel.add(new JLabel("Combo Box:"));
        basicPanel.add(comboBox);
        basicPanel.add(new JLabel("Slider:"));
        basicPanel.add(slider);
        basicPanel.add(new JLabel("Spinner:"));
        basicPanel.add(spinner);
        
        tabbedPane.addTab("Basic", basicPanel);

        // --- TAB 2: Lists & Tables ---
        JPanel listTablePanel = new JPanel(new BorderLayout());
        
        // List
        String[] listData = {"Apple", "Banana", "Cherry"};
        JList<String> list = new JList<>(listData);
        
        // Table
        String[] columnNames = {"Name", "Age"};
        Object[][] data = {{"Alice", 25}, {"Bob", 30}, {"Charlie", 35}};
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollTable = new JScrollPane(table);
        
        listTablePanel.add(new JScrollPane(list), BorderLayout.WEST);
        listTablePanel.add(scrollTable, BorderLayout.CENTER);
        
        tabbedPane.addTab("Lists & Tables", listTablePanel);

        // --- TAB 3: Trees & Menus ---
        JPanel treeMenuPanel = new JPanel(new BorderLayout());
        
        // Tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        root.add(new DefaultMutableTreeNode("Child 1"));
        root.add(new DefaultMutableTreeNode("Child 2"));
        JTree tree = new JTree(root);
        
        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        
        treeMenuPanel.add(new JScrollPane(tree), BorderLayout.WEST);
        frame.setJMenuBar(menuBar);
        
        tabbedPane.addTab("Trees & Menus", treeMenuPanel);

        // --- TAB 4: Dialogs & Progress ---
        JPanel dialogPanel = new JPanel(new FlowLayout());
        
        // File Chooser
        JButton openFileBtn = new JButton("Open File");
        openFileBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(frame);
        });
        
        // Color Chooser
        JButton colorBtn = new JButton("Pick Color");
        colorBtn.addActionListener(e -> {
            Color color = JColorChooser.showDialog(frame, "Choose Color", Color.BLUE);
            colorBtn.setBackground(color);
        });
        
        // Progress Bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        
        dialogPanel.add(openFileBtn);
        dialogPanel.add(colorBtn);
        dialogPanel.add(progressBar);
        
        tabbedPane.addTab("Dialogs", dialogPanel);

        // Add tabs to frame and display
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}