package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
public class UserData {
    private static long userCounter = 0;
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date createdAt;

    private LinkedList<Long> friends;
    private LinkedList<Long> trackingProjects;
    private ArrayList<Long> projects;
    private ArrayList<Long> publications;

    public UserData(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

    public UserData(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public static long getUserCounter() {
        return userCounter;
    }

    public static void setUserCounter(long userCounter) {
        UserData.userCounter = userCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LinkedList<Long> getFriends() {
        return friends;
    }

    public void setFriends(LinkedList<Long> friends) {
        this.friends = friends;
    }

    public LinkedList<Long> getTrackingProjects() {
        return trackingProjects;
    }

    public void setTrackingProjects(LinkedList<Long> trackingProjects) {
        this.trackingProjects = trackingProjects;
    }

    public ArrayList<Long> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Long> projects) {
        this.projects = projects;
    }

    public ArrayList<Long> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Long> publications) {
        this.publications = publications;
    }
}
