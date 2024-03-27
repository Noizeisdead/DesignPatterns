package Components;

import java.util.List;

public class Playlist extends MusicComposite
{
    public Playlist(String title)
    {
        super(title);
    }

    @Override
    public void add(MusicComponent song)
    {
        super.add(song);
    }

    @Override
    public void remove(MusicComponent song)
    {
        super.remove(song);
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Songs in playlist " + this.getTitle() + ":");
        List<MusicComponent> songs = super.getComponents();
        for (MusicComponent song : songs)
        {
            song.displayInfo();
        }
    }

    @Override
    public String getTitle()
    {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title)
    {
        super.setTitle(title);
    }

    @Override
    public List<MusicComponent> getComponents()
    {
        return super.getComponents();
    }

    @Override
    public void setComponents(List<MusicComponent> songs)
    {
        super.setComponents(songs);
    }
}
