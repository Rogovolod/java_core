package games.practice2d.object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Key extends SuperObject {

    public Key() {
        setName("Key");
        try {
            setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/items/key.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}