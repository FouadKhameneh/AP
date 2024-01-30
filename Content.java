import java.util.*;

public class Content {
    private int id;
    private String pictureAddress;
    private String description;
    private User contentOwner;
    private Recipe contentRecipe;

    // Constructor
    public Content(int id, String pictureAddress, String description, User contentOwner, Recipe contentRecipe) {
        this.id = id;
        this.pictureAddress = pictureAddress;
        this.description = description;
        this.contentOwner = contentOwner;
        this.contentRecipe = contentRecipe;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public String getDescription() {
        return description;
    }

    public User getContentOwner() {
        return contentOwner;
    }

    public Recipe getContentRecipe() {
        return contentRecipe;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContentOwner(User contentOwner) {
        this.contentOwner = contentOwner;
    }

    public void setContentRecipe(Recipe contentRecipe) {
        this.contentRecipe = contentRecipe;
    }
}

