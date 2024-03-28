package com.example.musicplayer;

import Components.Artist;
import Components.Genre;
import Components.Song;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
        // Load all pages that need a controller
        FXMLLoader helloLoader = new FXMLLoader(HelloApplication.class.getResource("Hello.fxml"));
        FXMLLoader fileLoader = new FXMLLoader(HelloApplication.class.getResource("File.fxml"));
        FXMLLoader songsLoader = new FXMLLoader(HelloApplication.class.getResource("Songs.fxml"));
        FXMLLoader albumsLoader = new FXMLLoader(HelloApplication.class.getResource("Albums.fxml"));
        FXMLLoader playlistLoader = new FXMLLoader(HelloApplication.class.getResource("Playlists.fxml"));
        FXMLLoader genreLoader = new FXMLLoader(HelloApplication.class.getResource("Genres.fxml"));

        // Load controllers
        HelloController helloController = helloLoader.getController();
        FileController fileController = fileLoader.getController();
        SongsController songsController = songsLoader.getController();
        AlbumController albumController = albumsLoader.getController();
        PlaylistController playlistController = playlistLoader.getController();
        GenreController genreController = genreLoader.getController();

        Scene scene = new Scene(helloLoader.load(), 1080, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}