package Components;

import com.mpatric.mp3agic.Mp3File;
import javafx.scene.media.Media;

import java.io.File;
import java.time.Duration;

public class Song {
    private String name;
    private Duration duration;
    private Mp3File content;
    private Artist artist;

//    public Song(String name, Duration duration, Media content, Artist artist) {
//        this.name = name;
//        this.duration = duration;
//        this.content = content;
//        this.artist = artist;
//    }

    public Song(String name, Mp3File content) {
        this.name = name;
        this.content = content;
//        this.duration = duration;
//        this.content = content;
//        this.artist = artist;
    }
    public void Edit(){

    }
    public void Delete(){

    }
    public void Play(){

    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

//    public Media getContent() {
//        return content;
//    }

//    public void setContent(Media content) {
//        this.content = content;
//    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
