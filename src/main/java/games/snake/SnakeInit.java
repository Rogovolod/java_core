package games.snake;

import javax.swing.*;

public class SnakeInit extends JFrame {

    public SnakeInit() {
        setTitle("Java Snake V0.1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocation(600, 100);
        add(new SnakeGame());
        setVisible(true);
    }

    public static void main(String[] args) {
        SnakeInit snakeInit = new SnakeInit();
    }

}
