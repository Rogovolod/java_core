package games.practice2d.object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Boots extends SuperObject {

    public Boots() {
        setName("Boots");
        try {
            setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/items/boots.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
