package dao;

import java.util.ArrayList;

public class Project {
    private long id;
    private long initializer;
    private ArrayList<Long> implementers;
    private String title;
    private String description;
    private String documentation;
    private double price;
    private ArrayList<Long> investors;

    public Project(long initializer, String title, String description, double price) {
        this.initializer = initializer;
        this.title = title;
        this.description = description;
        this.price = price;
        this.documentation = "The project has no duck";
    }

    public long getId() {
        return id;
    }

    public long getInitializer() {
        return initializer;
    }

    public void setInitializer(long initializer) {
        this.initializer = initializer;
    }

    public ArrayList<Long> getImplementers() {
        return implementers;
    }

    public void setImplementers(ArrayList<Long> implementers) {
        this.implementers = implementers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Long> getInvestors() {
        return investors;
    }

    public void setInvestors(ArrayList<Long> investors) {
        this.investors = investors;
    }
}
