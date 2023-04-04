import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Erb_Problem1 implements ActionListener {

    private JFrame gameFrame;
    private JPanel gamePanel;
    private JLabel messageLabel;
    private JButton[] board;
    private JButton newGameButton;

    private boolean xTurn = true; // true if it's X's turn, false if it's O's turn
    private boolean gameOver = false;

    private static final int BOARD_SIZE = 9;

    public Erb_Problem1() {
        gameFrame = new JFrame("Tic-Tac-Toe");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));
        messageLabel = new JLabel("", SwingConstants.CENTER);
        board = new JButton[BOARD_SIZE];
        newGameButton = new JButton("New Game");
        newGameButton.addActionListener(this);

        // add buttons to the game panel
        for (int i = 0; i < BOARD_SIZE; i++) {
            board[i] = new JButton("");
            board[i].addActionListener(this);
            gamePanel.add(board[i]);
        }

        // add components to the game frame
        gameFrame.getContentPane().add(gamePanel, BorderLayout.CENTER);
        gameFrame.getContentPane().add(messageLabel, BorderLayout.NORTH);
        gameFrame.getContentPane().add(newGameButton, BorderLayout.SOUTH);

        gameFrame.setSize(300, 300);
        gameFrame.setVisible(true);
    }

    // handle button clicks
    public void actionPerformed(ActionEvent e) {
        // handle new game button click
        if (e.getSource() == newGameButton) {
            resetBoard();
            String[] options = {"X", "O"};
            int choice = JOptionPane.showOptionDialog(gameFrame, "Choose your symbol", "New Game", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice == 0) {
                xTurn = true;
                messageLabel.setText("X's turn");
            } else {
                xTurn = false;
                messageLabel.setText("O's turn");
                playComputerMove();
            }
            gameOver = false;
            return;
        }

        // handle board button click
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (e.getSource() == board[i] && board[i].getText().equals("") && !gameOver) {
                if (xTurn) {
                    board[i].setText("X");
                    messageLabel.setText("O's turn");
                } else {
                    board[i].setText("O");
                    messageLabel.setText("X's turn");
                }
                xTurn = !xTurn;
                checkForWin();
                if (!gameOver && !xTurn) {
                    playComputerMove();
                }
            }
        }
    }

    // reset the board to a new game
    private void resetBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            board[i].setText("");
        }
        messageLabel.setText("");
    }
    // check if the game is over and update the message label
    private void checkForWin() {
        if (board[0].getText().equals(board[1].getText()) && board[1].getText().equals(board[2].getText()) && !board[0].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[0].getText() + " wins!");
        showEndGameDialog();
    } else if (board[3].getText().equals(board[4].getText()) && board[4].getText().equals(board[5].getText()) && !board[3].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[3].getText() + " wins!");
        showEndGameDialog();
    } else if (board[6].getText().equals(board[7].getText()) && board[7].getText().equals(board[8].getText()) && !board[6].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[6].getText() + " wins!");
        showEndGameDialog();
    } else if (board[0].getText().equals(board[3].getText()) && board[3].getText().equals(board[6].getText()) && !board[0].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[0].getText() + " wins!");
        showEndGameDialog();
    } else if (board[1].getText().equals(board[4].getText()) && board[4].getText().equals(board[7].getText()) && !board[1].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[1].getText() + " wins!");
        showEndGameDialog();
    } else if (board[2].getText().equals(board[5].getText()) && board[5].getText().equals(board[8].getText()) && !board[2].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[2].getText() + " wins!");
        showEndGameDialog();
    } else if (board[0].getText().equals(board[4].getText()) && board[4].getText().equals(board[8].getText()) && !board[0].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[0].getText() + " wins!");
        showEndGameDialog();
    } else if (board[2].getText().equals(board[4].getText()) && board[4].getText().equals(board[6].getText()) && !board[2].getText().equals("")) {
        gameOver = true;
        messageLabel.setText(board[2].getText() + " wins!");
        showEndGameDialog();
    } else if (!gameOver) {
        boolean isBoardFull = true;
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i].getText().equals("")) {
                isBoardFull = false;
                break;
            }
        }
        if (isBoardFull) {
            gameOver = true;
            messageLabel.setText("Tie game!");
            showEndGameDialog();
        }
    }
}

// play a move for the computer
private void playComputerMove() {
    int move = findBestMove();
    board[move].setText("O");
    xTurn = true;
    checkForWin();
}

// find the best move for the computer using a simple strategy
private int findBestMove() {
    for (int i = 0; i < BOARD_SIZE; i++) {
        if (board[i].getText().equals("")) {
            board[i].setText("O");
            if (isWinningMove("O")) {
                board[i].setText("");
                return i;
            }
            board[i].setText("");
        }
    }
    for (int i = 0; i < BOARD_SIZE; i++) {
        if (board[i].getText().equals("")) {
            board[i].setText("X");
            if (isWinningMove("X")) {
                board[i].setText("");
                return i;
            }
            board[i].setText("");
        }
    }
    // if no winning move is found, return a random move
    Random random = new Random();
    int move;
    do {
        move = random.nextInt(BOARD_SIZE);
    } while (!board[move].getText().equals(""));
    return move;
}

// check if the given move results in a win for the given player
private boolean isWinningMove(String player) {
    if (board[0].getText().equals(player) && board[1].getText().equals(player) && board[2].getText().equals(player)) {
        return true;
    } else if (board[3].getText().equals(player) && board[4].getText().equals(player) && board[5].getText().equals(player)) {
        return true;
    } else if (board[6].getText().equals(player) && board[7].getText().equals(player) && board[8].getText().equals(player)) {
        return true;
    } else if (board[0].getText().equals(player) && board[3].getText().equals(player) && board[6].getText().equals(player)) {
        return true;
    } else if (board[1].getText().equals(player) && board[4].getText().equals(player) && board[7].getText().equals(player)) {
        return true;
    } else if (board[2].getText().equals(player) && board[5].getText().equals(player) && board[8].getText().equals(player)) {
        return true;
    } else if (board[0].getText().equals(player) && board[4].getText().equals(player) && board[8].getText().equals(player)) {
        return true;
    } else if (board[2].getText().equals(player) && board[4].getText().equals(player) && board[6].getText().equals(player)) {
        return true;
    } else {
        return false;
    }
}

// show the end game dialog with options to start a new game or quit
private void showEndGameDialog() {
    JFrame endGameFrame = new JFrame();
    JPanel endGamePanel = new JPanel(new BorderLayout());
    JLabel messageLabel = new JLabel(this.messageLabel.getText(), SwingConstants.CENTER);
    JButton newGameButton = new JButton("New Game");
    JButton quitButton = new JButton("Quit");

    newGameButton.addActionListener(e -> {
        endGameFrame.dispose();
        resetBoard();
    });

    quitButton.addActionListener(e -> {
        System.exit(0);
    });

    endGamePanel.add(messageLabel, BorderLayout.CENTER);
    endGamePanel.add(newGameButton, BorderLayout.WEST);
    endGamePanel.add(quitButton, BorderLayout.EAST);

    endGameFrame.getContentPane().add(endGamePanel);
    endGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    endGameFrame.setSize(300, 100);
    endGameFrame.setLocationRelativeTo(null);
    endGameFrame.setVisible(true);
}

public static void main(String[] args) {
    Erb_Problem1 game = new Erb_Problem1();
}

}