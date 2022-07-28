package games.practice2d.object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Rock extends SuperObject {

    public Rock() {
        try {
            setName("Rock5");
            setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/tiles/rock5.png")));
            setCollision(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
