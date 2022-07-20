package games.practice2d;

import games.practice2d.object.Boots;
import games.practice2d.object.Chest;
import games.practice2d.object.Door;
import games.practice2d.object.Key;

public class AssetSetter {

    GamePanel gamePanel;

    public AssetSetter(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setObject() {
        gamePanel.objects[0] = new Key();
        gamePanel.objects[0].setWorldX(23 * gamePanel.titleSize);
        gamePanel.objects[0].setWorldY(7 * gamePanel.titleSize);

        gamePanel.objects[1] = new Key();
        gamePanel.objects[1].setWorldX(23 * gamePanel.titleSize);
        gamePanel.objects[1].setWorldY(40 * gamePanel.titleSize);

        gamePanel.objects[2] = new Key();
        gamePanel.objects[2].setWorldX(38 * gamePanel.titleSize);
        gamePanel.objects[2].setWorldY(9 * gamePanel.titleSize);

        gamePanel.objects[3] = new Door();
        gamePanel.objects[3].setWorldX(10 * gamePanel.titleSize);
        gamePanel.objects[3].setWorldY(11 * gamePanel.titleSize);

        gamePanel.objects[4] = new Door();
        gamePanel.objects[4].setWorldX(8 * gamePanel.titleSize);
        gamePanel.objects[4].setWorldY(28 * gamePanel.titleSize);

        gamePanel.objects[5] = new Door();
        gamePanel.objects[5].setWorldX(12 * gamePanel.titleSize);
        gamePanel.objects[5].setWorldY(22 * gamePanel.titleSize);

        gamePanel.objects[6] = new Chest();
        gamePanel.objects[6].setWorldX(10 * gamePanel.titleSize);
        gamePanel.objects[6].setWorldY(7 * gamePanel.titleSize);

        gamePanel.objects[7] = new Boots();
        gamePanel.objects[7].setWorldX(37 * gamePanel.titleSize);
        gamePanel.objects[7].setWorldY(42 * gamePanel.titleSize);

    }

}