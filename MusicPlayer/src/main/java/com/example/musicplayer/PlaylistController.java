package com.example.musicplayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class PlaylistController {
    public ListView<String> playlistList;

    public void initialize()
    {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Song1", "Song2", "Song3"
        );
        playlistList.setItems(items);

        playlistList.setOnMouseClicked(event -> {
            String selectedItem = playlistList.getSelectionModel().getSelectedItem();
            System.out.println("Selected song: " + selectedItem);
        });
    }
}
