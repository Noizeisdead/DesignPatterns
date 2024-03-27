package Components;

import java.util.List;

public class Artist extends MusicComposite{
    public Artist(String title) {
        super(title);
    }

    @Override
    public void add(MusicComponent album) {
        super.add(album);
    }

    @Override
    public void remove(MusicComponent album) {
        super.remove(album);
    }

    @Override
    public void displayInfo() {
        System.out.println("Music group: " + this.getTitle());
        List<MusicComponent> albums = super.getComponents();
        for (MusicComponent album : albums)
        {
            album.displayInfo();
        }
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public List<MusicComponent> getComponents() {
        return super.getComponents();
    }

    @Override
    public void setComponents(List<MusicComponent> album) {
        super.setComponents(album);
    }
}
