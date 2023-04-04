import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Erb_Problem3 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JTextField textField;
    private JButton addButton, subButton, mulButton, divButton, clearButton, calculateButton;
    private double num1 = 0, num2 = 0;
    private char operator;

    public Erb_Problem3() {
        // Create the text field
        textField = new JTextField();
        textField.setBounds(10, 10, 230, 25);
        // Add the text field to the frame
        add(textField);

        // Create the buttons
        addButton = new JButton("+");
        addButton.setBounds(10, 40, 50, 50);
        addButton.addActionListener(this);
        add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(70, 40, 50, 50);
        subButton.addActionListener(this);
        add(subButton);

        mulButton = new JButton("*");
        mulButton.setBounds(130, 40, 50, 50);
        mulButton.addActionListener(this);
        add(mulButton);

        divButton = new JButton("/");
        divButton.setBounds(190, 40, 50, 50);
        divButton.addActionListener(this);
        add(divButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(10, 100, 110, 50);
        clearButton.addActionListener(this);
        add(clearButton);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(130, 100, 110, 50);
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Set the frame properties
        setLayout(null);
        setVisible(true);
        setSize(260, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            operator = '+';
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (e.getSource() == subButton) {
            operator = '-';
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (e.getSource() == mulButton) {
            operator = '*';
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (e.getSource() == divButton) {
            operator = '/';
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (e.getSource() == clearButton) {
            num1 = 0;
            num2 = 0;
            operator = ' ';
            textField.setText("");
        } else if (e.getSource() == calculateButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    textField.setText(Double.toString(num1 + num2));
                    break;
                case '-':
                    textField.setText(Double.toString(num1 - num2));
                    break;
                case '*':
                    textField.setText(Double.toString(num1 * num2));
                    break;
                case '/':
                    textField.setText(Double.toString(num1 / num2));
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Erb_Problem3();
    }
}
