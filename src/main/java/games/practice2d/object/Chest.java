package games.practice2d.object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Chest extends SuperObject {

    public Chest() {
        setName("Chest");
        try {
            setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/items/chest.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
