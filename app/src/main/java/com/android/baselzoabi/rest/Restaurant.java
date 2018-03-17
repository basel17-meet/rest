package com.android.baselzoabi.rest;

/**
 * Created by User on 3/17/2018.
 */

public class Restaurant {
    private int id;

    private String name;
    private String category;
    private int phone;
    private String owner;


    public Restaurant(int id, String name, String category, int phone, String owner) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.phone = phone;
        this.owner = owner;
    }

    public Restaurant() {
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "category='" + category + '\'' +
                ", phone=" + phone +
                ", owner='" + owner + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}