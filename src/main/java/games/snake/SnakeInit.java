package games.snake;

import javax.swing.*;
import java.awt.*;

public class SnakeInit extends JFrame {

    public SnakeInit() {
        setTitle("Java Snake V0.1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(800, 600);
        add(new Component() { //game class
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        SnakeInit snakeInit = new SnakeInit();
    }

}
