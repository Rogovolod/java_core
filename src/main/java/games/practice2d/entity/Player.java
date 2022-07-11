package games.practice2d.entity;

import games.practice2d.GamePanel;
import games.practice2d.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends Entity {

    public final int screenX;
    public final int screenY;

    private final GamePanel gamePanel;
    private final KeyHandler keyHandler;

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {
        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;
        screenX = gamePanel.screenWidth / 2;
        screenY = gamePanel.screenHeight / 2;
        solidArea = new Rectangle(8, 16, 32, 32);
        setDefaultValues();
        getPlayerImage();
    }


    public void getPlayerImage() {
        try {
            up1 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig1up.png"));
            up2 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig2up.png"));
            down1 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig1d.png"));
            down2 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig2d.png"));
            left1 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig1left.png"));
            left2 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig2left.png"));
            right1 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig1right.png"));
            right2 = ImageIO.read(new File("src/main/java/games/practice2d/res/pig/pig2right.png"));
/*            up1 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotfback1.png"));
            up2 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotfback2.png"));
            down1 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotface1.png"));
            down2 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotface2.png"));
            left1 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotfleft1.png"));
            left2 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotfleft2.png"));
            right1 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotright1.png"));
            right2 = ImageIO.read(new File("src/main/java/games/practice2d/res/carrot/carrotright2.png"));*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDefaultValues() {
        worldX = gamePanel.titleSize * 23;
        worldY = gamePanel.titleSize * 21;
        speed = gamePanel.WORLD_WIDTH / 600;
        direction = "down";
    }

    public void update() {
        if (keyHandler.upPressed || keyHandler.downPressed || keyHandler.rightPressed || keyHandler.leftPressed) {
            if (keyHandler.upPressed) {
                direction = "up";
            } else if (keyHandler.downPressed) {
                direction = "down";
            } else if (keyHandler.rightPressed) {
                direction = "right";
            } else {
                direction = "left";
            }

            collisionOn = false;
            gamePanel.collisionChecker.checkTile(this);

            if (!collisionOn) {
                switch (direction) {
                    case "up" -> worldY -= speed;
                    case "down" -> worldY += speed;
                    case "right" -> worldX += speed;
                    case "left" -> worldX -= speed;
                }

                spriteCounter++;
                if (spriteCounter > 12) {
                    if (spriteNumber == 1) spriteNumber = 2;
                    else if (spriteNumber == 2) spriteNumber = 1;
                    spriteCounter = 0;
                }
            }
        }
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;
        switch (direction) {
            case "up" -> {
                if (spriteNumber == 1) image = up1;
                if (spriteNumber == 2) image = up2;
            }
            case "down" -> {
                if (spriteNumber == 1) image = down1;
                if (spriteNumber == 2) image = down2;
            }
            case "left" -> {
                if (spriteNumber == 1) image = left1;
                if (spriteNumber == 2) image = left2;
            }
            case "right" -> {
                if (spriteNumber == 1) image = right1;
                if (spriteNumber == 2) image = right2;
            }
        }
        g2.drawImage(image, screenX, screenY, gamePanel.titleSize, gamePanel.titleSize, null);
    }

}
