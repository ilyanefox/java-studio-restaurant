package com.company;

import java.util.Date;

public class MenuItem {
    private String description;
    private String category;
    private double price;
    private Boolean isNew;

    public MenuItem(String description, String category, double price, boolean isNew) {
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getIsNew() {
        return isNew;
    }


}

