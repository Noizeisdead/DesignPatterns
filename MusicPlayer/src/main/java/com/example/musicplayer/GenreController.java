package com.example.musicplayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class GenreController {
    public ListView<String> genreList;

    public void initialize()
    {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Song1", "Song2", "Song3"
        );
        genreList.setItems(items);

        genreList.setOnMouseClicked(event -> {
            String selectedItem = genreList.getSelectionModel().getSelectedItem();
            System.out.println("Selected song: " + selectedItem);
        });
    }
}
