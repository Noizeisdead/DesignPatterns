package com.example.musicplayer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.mpatric.mp3agic.*;
import java.io.File;


public class FileController {
    @FXML
    private Label selectedFileLabel;
//    @FXML
//    private Label
    private File selectedFile;

    @FXML
    private void browseFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            this.selectedFile = selectedFile.getAbsoluteFile();
            this.selectedFileLabel.setText(this.selectedFile.getName());

        }
    }

    @FXML
    private void submitForm() throws IOException {
        if (this.selectedFile != null ) {
            try {
                Path FileToBe = Paths.get("./src/main/resources/Songs/", selectedFile.getName());
                readMetadata();
                Files.copy(selectedFile.toPath(), FileToBe);

            } catch (FileAlreadyExistsException OI ) {
                System.out.println("Aaaah");
            } catch (InvalidDataException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedTagException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Selected File: " + selectedFile);
    }

    @FXML
    private void readMetadata() throws IOException, InvalidDataException, UnsupportedTagException {
        Mp3File mp3file = new Mp3File("./src/main/resources/Songs/LemonDemon_Touch.mp3");
        System.out.println("Length of this mp3 is: " + mp3file.getLengthInSeconds() + " seconds");
        System.out.println("Bitrate: " + mp3file.getBitrate() + " kbps " + (mp3file.isVbr() ? "(VBR)" : "(CBR)"));
        System.out.println("Sample rate: " + mp3file.getSampleRate() + " Hz");
        System.out.println("Has ID3v1 tag?: " + (mp3file.hasId3v1Tag() ? "YES" : "NO"));
        System.out.println("Has ID3v2 tag?: " + (mp3file.hasId3v2Tag() ? "YES" : "NO"));
        System.out.println("Has custom tag?: " + (mp3file.hasCustomTag() ? "YES" : "NO"));
        ID3v2 id3v2Tag = mp3file.getId3v2Tag();
        System.out.println("Title: " + id3v2Tag.getTitle());
        System.out.println("Artist: " + id3v2Tag.getArtist());
        System.out.println("Album: " + id3v2Tag.getAlbum());
        System.out.println("Year: " + id3v2Tag.getYear());

    }

    @FXML
    private void writeMetaData() throws InvalidDataException, UnsupportedTagException, IOException, NotSupportedException {
       try{
        System.out.println("Wrote to file");
        Mp3File mp3file = new Mp3File("./src/main/resources/Songs/LemonDemon_Touch.mp3");
        ID3v2 id3v2Tag;
        if (mp3file.hasId3v2Tag()) {
            id3v2Tag = mp3file.getId3v2Tag();
            System.out.println("Had tag");
        } else {
            id3v2Tag = new ID3v24Tag();
            mp3file.setId3v2Tag(id3v2Tag);
            System.out.println("didnt Had tag");
        }

        // Set metadata fields
        id3v2Tag.setTitle("New Title");
        id3v2Tag.setArtist("New Artist");
        id3v2Tag.setAlbum("New Album");
        String filename = mp3file.getFilename();
        // Save changes to the MP3 file
        mp3file.save("./src/main/resources/Songs/Temp.mp3");
        File temp = new File("./src/main/resources/Songs/Temp.mp3");
        temp.renameTo(new File("./src/main/resources/Songs/LemonDemon_Touch.mp3"));

    } catch (IOException | UnsupportedTagException | InvalidDataException | NotSupportedException e) {
        e.printStackTrace();
    }

    }


}
