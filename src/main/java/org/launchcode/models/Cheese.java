package org.launchcode.models;

/**
 * Created by Sarah on 4/6/2017.
 */
public class Cheese {

    private String name;
    private String description;
    private int cheeseId;
    private static int nextId = 1;

    public Cheese(String name, String description) {
        this();  // Call the default constructor (Cheese())
        this.name = name;
        this.description = description;
    }

    // Default constructor
    public Cheese() {
        cheeseId = nextId;
        nextId++;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
