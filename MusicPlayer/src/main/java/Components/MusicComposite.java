package Components;

import java.util.ArrayList;
import java.util.List;

public abstract class MusicComposite implements MusicComponent
{
    private String title;
    private List<MusicComponent> components;

    public MusicComposite(String title)
    {
        this.title = title;
        this.components = new ArrayList<>();
    }

    public void add(MusicComponent component)
    {
        components.add(component);
    }

    public void remove(MusicComponent component)
    {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MusicComponent> getComponents() {
        return components;
    }

    public void setComponents(List<MusicComponent> components) {
        this.components = components;
    }
}
