package com.example.musicplayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class ArtistController {
    public ListView<String> artistList;

    public void initialize()
    {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Song1", "Song2", "Song3"
        );
        artistList.setItems(items);

        artistList.setOnMouseClicked(event -> {
            String selectedItem = artistList.getSelectionModel().getSelectedItem();
            System.out.println("Selected song: " + selectedItem);
        });
    }
}
