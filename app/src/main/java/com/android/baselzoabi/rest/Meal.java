package com.android.baselzoabi.rest;

/**
 * Created by User on 3/17/2018.
 */

public class Meal {
    private int id;
    private int rest_id;
    private String meal_name;
    private String meal_description;
    private float price;

    public Meal() {
    }

    public Meal(int id, int rest_id, String meal_name, String meal_description, float price) {
        this.id = id;
        this.rest_id = rest_id;
        this.meal_name = meal_name;
        this.meal_description = meal_description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRest_id() {
        return rest_id;
    }

    public void setRest_id(int rest_id) {
        this.rest_id = rest_id;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public String getMeal_description() {
        return meal_description;
    }

    public void setMeal_description(String meal_description) {
        this.meal_description = meal_description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", rest_id=" + rest_id +
                ", meal_name='" + meal_name + '\'' +
                ", meal_description='" + meal_description + '\'' +
                ", price=" + price +
                '}';
    }
}
