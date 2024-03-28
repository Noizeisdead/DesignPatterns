package com.example.musicplayer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class NavBarController {

    @FXML
    private Button fileButton;

    @FXML
    private Button songButton;

    @FXML
    private Button playlistButton;

    @FXML
    private Button albumButton;

    @FXML
    private Button genreButton;

    @FXML
    private Button aboutButton;


    @FXML
    protected void onFileButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("File.fxml"));
        Parent root = loader.load();

        // Access the controller of the secondary FXML
        FileController controller = loader.getController();

        // You may pass any necessary data to the controller here

        Stage stage = (Stage) fileButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    protected void onSongsButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Songs.fxml"));
        Parent root = loader.load();

        // Access the controller of the secondary FXML
        SongsController controller = loader.getController();


        Stage stage = (Stage) songButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    protected void onPlaylistsButtonClick() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Playlists.fxml"));
        Parent root = loader.load();

        // Access the controller of the secondary FXML
        PlaylistController controller = loader.getController();


        Stage stage = (Stage) playlistButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    protected void onAlbumsButtonClick() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Albums.fxml"));
        Parent root = loader.load();

        // Access the controller of the secondary FXML
        AlbumController controller = loader.getController();


        Stage stage = (Stage) albumButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    protected void onGenresButtonClick() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Genres.fxml"));
        Parent root = loader.load();

        // Access the controller of the secondary FXML
        GenreController controller = loader.getController();


        Stage stage = (Stage) genreButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    protected void onAboutButtonClick() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("About.fxml"));
        Parent root = loader.load();

        // Access the controller of the secondary FXML
        AboutController controller = loader.getController();


        Stage stage = (Stage) aboutButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
}


