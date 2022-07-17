package games.practice2d.object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Door extends SuperObject {

    public Door() {
        setCollision(true);
        setName("Door");
        try {
            setImage(ImageIO.read(new File("src/main/java/games/practice2d/res/items/door.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
