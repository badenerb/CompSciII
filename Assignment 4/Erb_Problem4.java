import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Erb_Problem4 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JTextField textField;
    private JTextArea textArea;

    public Erb_Problem4() {
        // Create the text field
        textField = new JTextField();
        textField.setBounds(10, 10, 200, 25);
        // Add the text field to the frame
        add(textField);

        // Create the button
        JButton button = new JButton("Create Window");
        button.setBounds(10, 40, 200, 25);
        button.addActionListener(this);
        // Add the button to the frame
        add(button);

        // Create the text area
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 75, 200, 100);
        // Add the text area to the frame
        add(scrollPane);

        // Set the frame properties
        setLayout(null);
        setVisible(true);
        setSize(240, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Create Window")) {
            String name = textField.getText();
            // Create a new window with the name as the title
            JFrame window = new JFrame(name);
            window.setVisible(true);
            window.setSize(200, 200);
            // Add a label with the name to the window
            JLabel label = new JLabel("Hello " + name + "!");
            label.setBounds(10, 10, 150, 25);
            window.add(label);
            // Add the name to the text area
            textArea.append(name + " window created\n");
        }
    }

    public static void main(String[] args) {
        new Erb_Problem4();
    }
}
