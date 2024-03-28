package com.example.musicplayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class AlbumController {
    public ListView<String> albumsList;

    public void initialize()
    {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Song1", "Song2", "Song3"
        );
        albumsList.setItems(items);

        albumsList.setOnMouseClicked(event -> {
            String selectedItem = albumsList.getSelectionModel().getSelectedItem();
            System.out.println("Selected song: " + selectedItem);
        });
    }
}
