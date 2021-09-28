package com.company;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here
    MenuItem frenchFries = new MenuItem("fries", "appetizer", 5, true);
    MenuItem steak = new MenuItem("steak", "entree", 20, false);
    MenuItem iceCream = new MenuItem("chocolate", "dessert", 6, true);

    Date today = Calendar.getInstance().getTime();

    ArrayList<MenuItem> startingMenu = new ArrayList<MenuItem>();

    Menu menu = new Menu(startingMenu, today);
    menu.addItem(frenchFries);
    menu.addItem(steak);
    menu.addItem(iceCream);

    menu.printMenu();
    System.out.println(menu.getLastUpdated());
    }
}
