package com.example.musicplayer;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SongsController {
    @FXML
    private ListView<String> songsList;

    public void initialize()
    {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Song1", "Song2", "Song3"
        );
        songsList.setItems(items);

        songsList.setOnMouseClicked(event -> {
            String selectedItem = songsList.getSelectionModel().getSelectedItem();
            System.out.println("Selected song: " + selectedItem);
        });
    }
}
