import java.util.ArrayList;

public class Recipe {
    
    private int id;
    private ArrayList<String> Resources;
    private String description;

    // Constructor
    public Recipe(int id, ArrayList<String> Resources, String description) {
        this.id = id;
        this.Resources = Resources;
        this.description = description;
    }

    // Getters
    public int getId() {
        return id;
    }

    public ArrayList<String> getResources() {
        return Resources;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setResources(ArrayList<String> Resources) {
        this.Resources = Resources;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

