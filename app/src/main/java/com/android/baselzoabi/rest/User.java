package com.android.baselzoabi.rest;

/**
 * Created by User on 3/17/2018.
 */

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String restaurant;

    public User() {
    }

    public User(int id, String name, String username, String password, String restaurant) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
