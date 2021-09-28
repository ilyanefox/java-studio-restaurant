package com.company;

import java.util.Date;
import java.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MenuItem {
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    private Date itemUpdated;


    public MenuItem(String description, String category, double price, boolean isNew) {
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }


    public boolean isNew() {
        Date today = new Date();

        long diffInMillies = Math.abs(today.getTime() + this.getItemUpdated().getTime());
        long diffDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return diffDays < 28;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
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

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getItemUpdated() {
        return itemUpdated;
    }

    public void setItemUpdated(Date itemUpdated) {
        this.itemUpdated = itemUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category, price);
    }
}

