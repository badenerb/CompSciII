 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Erb_Problem2 extends JFrame {
private static final int GRID_SIZE = 9;
    private static final int BOX_SIZE = 3;
    private JTextField[][] grid;

    public Erb_Problem2() {
        super("Sudoku Game");

        createGUI();
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createGUI() {
        JPanel mainPanel = new JPanel(new GridLayout(GRID_SIZE, GRID_SIZE));
        grid = new JTextField[GRID_SIZE][GRID_SIZE];

        // Create text fields and add to main panel
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                grid[row][col] = new JTextField(1);
                grid[row][col].setHorizontalAlignment(JTextField.CENTER);
                mainPanel.add(grid[row][col]);
            }
        }

        // Create solve and reset buttons
        JButton solveButton = new JButton("Solve");
        JButton resetButton = new JButton("Reset");
        solveButton.addActionListener(new SolveButtonListener());
        resetButton.addActionListener(new ResetButtonListener());

        // Add components to frame
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(mainPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(solveButton);
        buttonPanel.add(resetButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    private boolean isValid(int row, int col, int num) {
        // Check row
        for (int c = 0; c < GRID_SIZE; c++) {
            if (grid[row][c].getText().equals(String.valueOf(num))) {
                return false;
            }
        }

        // Check column
        for (int r = 0; r < GRID_SIZE; r++) {
            if (grid[r][col].getText().equals(String.valueOf(num))) {
                return false;
            }
        }

        // Check box
        int boxRow = row - row % BOX_SIZE;
        int boxCol = col - col % BOX_SIZE;
        for (int r = boxRow; r < boxRow + BOX_SIZE; r++) {
            for (int c = boxCol; c < boxCol + BOX_SIZE; c++) {
                if (grid[r][c].getText().equals(String.valueOf(num))) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean solve() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (grid[row][col].getText().isEmpty()) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            grid[row][col].setText(String.valueOf(num));
                            if (solve()) {
                                return true;
                            } else {
                                grid[row][col].setText("");
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private void reset() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                grid[row][col].setText("");
            }
        }
    }

    private class SolveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (solve()) {
                JOptionPane.showMessageDialog(null, "Sudoku solved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to solve Sudoku", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

private class ResetButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        reset();
    }
}

public static void main(String[] args) {
    Erb_Problem2 game = new Erb_Problem2();
}}
