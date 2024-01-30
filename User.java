import java.util.*;

public class User {

    private String userName;
    private int id;
    private String password;
    private String description;
    private ArrayList<Content> contents;
    private ArrayList<Recipe> recipes;

    // Constructor
    public User(String userName, int id, String password, String description) {
        this.userName = userName;
        this.id = id;
        this.password = password;
        this.description = description;
        this.contents = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }
    
    //Other Methods
    public void addContent(Content content) {
        contents.add(content);
    }
}
