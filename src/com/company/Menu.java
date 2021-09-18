package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> item;
    private Date lastUpdated = new Date();

    public Menu(ArrayList<MenuItem> item, Date lastUpdated) {
        this.item = item;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItem() {
        return item;
    }

    public void setItems(ArrayList<MenuItem> item) {
        this.item = item;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
