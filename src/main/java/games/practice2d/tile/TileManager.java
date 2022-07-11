package games.practice2d.tile;

import games.practice2d.GamePanel;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    private final GamePanel gamePanel;
    public final Tile[] tile;
    public final int[][] mapTileNumber;

    public TileManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        tile = new Tile[10];
        mapTileNumber = new int[gamePanel.MAX_WORLD_COLUMNS][gamePanel.MAX_WORLD_ROWS];
        getTileImage();
        loadMap("src/main/java/games/practice2d/res/maps/world01.csv");
    }

    public void loadMap(String filePath) {
        try {
            InputStream is = new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            for (int i = 0; i < gamePanel.MAX_WORLD_ROWS; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < gamePanel.MAX_WORLD_COLUMNS; j++) {
                    mapTileNumber[j][i] = Integer.parseInt(line[j]);
                }
            }
            is.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/grass.png")));
            tile[1] = new Tile();
            tile[1].setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/wall.png")));
            tile[1].setCollision(true);
            tile[2] = new Tile();
            tile[2].setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/water.png")));
            tile[2].setCollision(true);
            tile[3] = new Tile();
            tile[3].setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/earth.png")));
            tile[4] = new Tile();
            tile[4].setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/tree.png")));
            tile[4].setCollision(true);
            tile[5] = new Tile();
            tile[5].setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/sand.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {
        for (int i = 0; i < gamePanel.MAX_WORLD_ROWS; i++) {
            for (int j = 0; j < gamePanel.MAX_WORLD_COLUMNS; j++) {
                int worldX = j * gamePanel.titleSize;
                int worldY = i * gamePanel.titleSize;
                double screenX = worldX - gamePanel.player.worldX + gamePanel.player.screenX;
                double screenY = worldY - gamePanel.player.worldY + gamePanel.player.screenY;
                if (worldX + gamePanel.titleSize > gamePanel.player.worldX - gamePanel.player.screenX &&
                    worldX - gamePanel.titleSize < gamePanel.player.worldX + gamePanel.player.screenX &&
                    worldY + gamePanel.titleSize > gamePanel.player.worldY - gamePanel.player.screenY &&
                    worldY - gamePanel.titleSize < gamePanel.player.worldY + gamePanel.player.screenY) {
                    g2.drawImage(tile[mapTileNumber[j][i]].getImage(), (int)screenX, (int)screenY, gamePanel.titleSize, gamePanel.titleSize, null);
                }
            }
        }
    }

}
