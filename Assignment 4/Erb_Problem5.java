import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Erb_Problem5 implements ActionListener {
    private JFrame frame;
    private JButton[] buttons;
    private int[] combination = {1, 2, 3};
    private int[] input = new int[3];
    private int inputIndex = 0;

    public Erb_Problem5() {
        // Create the frame
        frame = new JFrame("Button Combination");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 3));

        // Create the buttons
        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(Integer.toString(i));
            buttons[i].addActionListener(this);
            frame.add(buttons[i]);
        }

        // Set the frame properties
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();
        int buttonNumber = Integer.parseInt(buttonLabel);
        input[inputIndex++] = buttonNumber;
        if (inputIndex == 3) {
            if (input[0] == combination[0] && input[1] == combination[1] && input[2] == combination[2]) {
                JOptionPane.showMessageDialog(frame, "You have entered the correct combination!");
                System.exit(0);
            } else {
                frame.getContentPane().setBackground(Color.RED);
                JOptionPane.showMessageDialog(frame, "Incorrect combination. Please try again.");
                frame.getContentPane().setBackground(null);
                inputIndex = 0;
            }
        }
    }

    public static void main(String[] args) {
        new Erb_Problem5();
    }
}
