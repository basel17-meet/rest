package com.android.baselzoabi.rest;

/**
 * Created by User on 3/17/2018.
 */

public class Rating {
    private int id;
    private int rest_id;
    private int meal_id;
    private float offive;

    public Rating() {
    }

    public Rating(int id, int rest_id, String name, String meal_desc, float price) {
        this.id = id;
        this.rest_id = rest_id;
        this.meal_id = meal_id;
        this.offive = price;
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


    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(String meal_desc) {
        this.meal_id = meal_id;
    }

    public float getOffive() {
        return offive;
    }

    public void setoffive(float offive) {
        this.offive = offive;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", rest_id=" + rest_id + '\'' +
                ", meal_id='" + meal_id + '\'' +
                ", price=" + offive +
                '}';
    }
}
