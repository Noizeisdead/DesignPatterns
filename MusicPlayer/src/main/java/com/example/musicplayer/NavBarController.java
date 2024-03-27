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
    private Button GenreButton;

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
    protected void onPlaylistsButtonClick() {
    }
    @FXML
    protected void onAlbumsButtonClick() {
    }
    @FXML
    protected void onGenresButtonClick() {
    }
    @FXML
    protected void onAboutButtonClick() {

    }
}


