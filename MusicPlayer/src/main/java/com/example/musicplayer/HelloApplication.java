package com.example.musicplayer;

import Components.Artist;
import Components.Song;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws InvalidDataException, UnsupportedTagException, IOException {

        FileController fileController = new FileController();
        File dir = new File("./src/main/resources/Songs");
        File[] directoryListing = dir.listFiles();

        System.out.println("aaaa");
        if (directoryListing != null) {
            System.out.println("BBBB");
            for (File child : directoryListing) {
                Mp3File mp3file = new Mp3File(child);
                // Do something with child
                ID3v2 id3v2Tag = mp3file.getId3v2Tag();
                System.out.println("Title: " + id3v2Tag.getTitle());
                System.out.println("Artist: " + id3v2Tag.getArtist());
                System.out.println("Album: " + id3v2Tag.getAlbum());
                System.out.println("Year: " + id3v2Tag.getYear());
                new Song(id3v2Tag.getTitle(), mp3file);
            }

        }
        launch();
    }
}