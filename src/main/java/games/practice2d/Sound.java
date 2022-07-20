package games.practice2d;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {

    Clip clip;
    File soundURL[] = new File[10];

    public Sound() {
            soundURL[0] = new File("src/main/java/games/practice2d/res/sound/2DGameMusic.wav");
            soundURL[1] = new File("src/main/java/games/practice2d/res/sound/coin.wav");
            soundURL[2] = new File("src/main/java/games/practice2d/res/sound/powerup.wav");
            soundURL[3] = new File("src/main/java/games/practice2d/res/sound/unlock.wav");
            soundURL[4] = new File("src/main/java/games/practice2d/res/sound/fanfare.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }

}
