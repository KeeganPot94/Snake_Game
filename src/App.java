/*
 * A 2D snake game
 */

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        // variables to set frame size
        int boardWidth = 600;
        int boardHeight = boardWidth;

        // create a JFrame object and attributes
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

    }
}
