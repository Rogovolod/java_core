package games.practice2d;

import games.practice2d.entity.Entity;

public class CollisionChecker {

    private final GamePanel gamePanel;

    public CollisionChecker(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void checkTile(Entity entity) {
        int entityLeftWorldX = (int)entity.worldX + entity.solidArea.x;
        int entityRightWorldX = (int)entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY = (int)entity.worldY + entity.solidArea.y;
        int entityBottomWorldY = (int)entity.worldY + entity.solidArea.y + entity.solidArea.height;

        int entityLeftColumn = entityLeftWorldX / gamePanel.titleSize;
        int entityRightColumn = entityRightWorldX / gamePanel.titleSize;
        int entityTopRow = entityTopWorldY / gamePanel.titleSize;
        int entityBottomRow = entityBottomWorldY / gamePanel.titleSize;

        int tileNum1, tileNum2;

        switch (entity.direction) {
            case "up" -> {
                entityTopRow = (entityTopWorldY - entity.speed) / gamePanel.titleSize;
                tileNum1 = gamePanel.tileManager.mapTileNumber[entityLeftColumn][entityTopRow];
                tileNum2 = gamePanel.tileManager.mapTileNumber[entityRightColumn][entityTopRow];
                if (gamePanel.tileManager.tile[tileNum1].isCollision() ||
                        gamePanel.tileManager.tile[tileNum2].isCollision()) {
                    entity.collisionOn = true;
                }
            }
            case "down" -> {
                entityBottomRow = (entityBottomWorldY + entity.speed) / gamePanel.titleSize;
                tileNum1 = gamePanel.tileManager.mapTileNumber[entityLeftColumn][entityBottomRow];
                tileNum2 = gamePanel.tileManager.mapTileNumber[entityRightColumn][entityBottomRow];
                if (gamePanel.tileManager.tile[tileNum1].isCollision() ||
                        gamePanel.tileManager.tile[tileNum2].isCollision()) {
                    entity.collisionOn = true;
                }
            }
            case "right" -> {
                entityRightColumn = (entityRightWorldX + entity.speed) / gamePanel.titleSize;
                tileNum1 = gamePanel.tileManager.mapTileNumber[entityLeftColumn][entityTopRow];
                tileNum2 = gamePanel.tileManager.mapTileNumber[entityRightColumn][entityBottomRow];
                if (gamePanel.tileManager.tile[tileNum1].isCollision() ||
                        gamePanel.tileManager.tile[tileNum2].isCollision()) {
                    entity.collisionOn = true;
                }
            }
            case "left" -> {
                entityLeftColumn = (entityLeftWorldX - entity.speed) / gamePanel.titleSize;
                tileNum1 = gamePanel.tileManager.mapTileNumber[entityLeftColumn][entityTopRow];
                tileNum2 = gamePanel.tileManager.mapTileNumber[entityLeftColumn][entityBottomRow];
                if (gamePanel.tileManager.tile[tileNum1].isCollision() ||
                        gamePanel.tileManager.tile[tileNum2].isCollision()) {
                    entity.collisionOn = true;
                }
            }
        }
    }

}
