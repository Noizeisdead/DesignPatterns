package Components;

import java.io.File;

public class Song implements MusicComponent
{
    private String name;
    private File content;


    public Song(String name, File content)
    {
        this.name = name;
        this.content = content;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Song: " +  this.getName());
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public File getContent() {
        return content;
    }

    public void setContent(File content) {
        this.content = content;
    }
}
