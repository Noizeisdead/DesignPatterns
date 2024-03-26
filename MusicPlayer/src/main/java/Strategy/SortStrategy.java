package Strategy;

import Components.Song;

import java.util.List;

public interface SortStrategy {
    public void sort(List<Song> songs);
}
