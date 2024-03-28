package Command;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Play implements Command{
    private MediaPlayer mediaPlayer;
    @Override
    public void Execute() {
        Media media = new Media(new File("./src/main/resources/Songs/LemonDemon_Touch.mp3").toURI().toString());
        // Create a media player
        this.mediaPlayer = new MediaPlayer(media);

        // Play the audio
        this.mediaPlayer.play();
        System.out.println("Play button clicked");
    }
}
