package com.example.musicplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;

import java.io.File;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ControlsController {

    @FXML
    private Slider volumeSlider;
    @FXML
    private Slider progressBar;

    private MediaPlayer mediaPlayer;

    @FXML
    private void play() {
        Media media = new Media(new File("./src/main/resources/Songs/LemonDemon_Touch.mp3").toURI().toString());
        // Create a media player
        this.mediaPlayer = new MediaPlayer(media);

        // Play the audio
        this.mediaPlayer.play();
        System.out.println("Play button clicked");
    }

    @FXML
    private void pause() {
        if(this.mediaPlayer.getStatus() == MediaPlayer.Status.PAUSED) {
            this.mediaPlayer.play();
        }
        if (this.mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            this.mediaPlayer.pause();
        }

        System.out.println("Pause button clicked");
    }

}