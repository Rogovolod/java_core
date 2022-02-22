package games.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame extends JPanel implements ActionListener {

    private final int SIZE = 800;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private int delay = 250;
    private Timer timer = new Timer(delay, this);
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;
    private int score;
    private final int bestScore = readBestScore();
    private final String fileName = "src/main/java/games/snake/resources/bestscore.csv";
    Image img;
    JButton Button = new JButton("Do you want play again?");

    public SnakeGame() {
        img = Toolkit.getDefaultToolkit().createImage("src/main/java/games/snake/resources/back.png");
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i * DOT_SIZE;
            y[i] = 48;
        }
        timer.start();
        createApple();
    }

    public void createApple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }

    public void loadImages() {
        ImageIcon iia = new ImageIcon("src/main/java/games/snake/resources/apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("src/main/java/games/snake/resources/snake.png");
        dot = iid.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot, x[i], y[i], this);
            }
        } else {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Times New Roman", Font.BOLD, 30));
            g.drawString("Game Over!", 290, 270);
            g.drawString("Your score: " + score, 280, 300);
            g.drawString("The best score: " + bestScore, 260, 330);

            if (bestScore < score) {
                g.drawString("You are the best! You got new best score!", 110, 360);
                saveBestScore();
            }
        }
    }

    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        if (left) {
            x[0] -= DOT_SIZE;
        }
        if (right) {
            x[0] += DOT_SIZE;
        }
        if (up) {
            y[0] -= DOT_SIZE;
        }
        if (down) {
            y[0] += DOT_SIZE;
        }
    }

    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++;
            createApple();
            score += 5;
            delay -= 5;
            timer.setDelay(delay);
        }
    }

    public void checkCollisions() {
        for (int i = dots; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        if (x[0] > SIZE) {
            inGame = false;
        }
        if (x[0] < 0) {
            inGame = false;
        }
        if (y[0] > SIZE) {
            inGame = false;
        }
        if (y[0] < 0) {
            inGame = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkCollisions();
            move();
        }
        repaint();
    }

    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int Key = e.getKeyCode();
            if (Key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;
            }
            if (Key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }
            if (Key == KeyEvent.VK_UP && !down) {
                right = false;
                up = true;
                left = false;
            }
            if (Key == KeyEvent.VK_DOWN && !up) {
                right = false;
                down = true;
                left = false;
            }
        }
    }

    private int readBestScore() {
        int bestScore = 0;
        try (Scanner scanner = new Scanner(new File(fileName));) {
            bestScore = scanner.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bestScore;
    }

    private void saveBestScore() {
        Path path = Paths.get(fileName);
        byte[] strToBytes = String.valueOf(score).getBytes();
        try {
            Files.write(path, strToBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}