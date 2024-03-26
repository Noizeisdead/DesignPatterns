package Strategy;

import Components.Song;

import java.util.List;

public class SortService {
    private SortStrategy sortStrategy;
    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public void Sort(List<Song> songs){
        this.sortStrategy.sort(songs);
    }
}
