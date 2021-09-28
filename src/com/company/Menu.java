package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;


    public Menu(ArrayList<MenuItem> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> addItem(MenuItem menuItem) {
        this.items.add(menuItem);
        return this.items;
    }

    public void removeItem(MenuItem menuItem) {
        this.items.remove(menuItem);
    }

    public MenuItem printItem(MenuItem menuItem) {
        return menuItem;
    }

    public void printMenu() {

        for (MenuItem item : items) {
            System.out.println(item.getDescription() + " $" + item.getPrice());
        }
    }

    //Not sure about this. How do I get the most recent date that something was added?



    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
