package Command;

import javafx.scene.media.MediaPlayer;

public class Pause implements Command{
    private MediaPlayer mediaPlayer;
    @Override
    public void Execute() {
        if(this.mediaPlayer.getStatus() == MediaPlayer.Status.PAUSED) {
            this.mediaPlayer.play();
        }
        if (this.mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            this.mediaPlayer.pause();
        }

        System.out.println("Pause button clicked");
    }
}
