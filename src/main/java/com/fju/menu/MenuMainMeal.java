package com.fju.menu;


import java.util.ArrayList;

public class MenuMainMeal extends Menu {

    public MenuMainMeal() {
        menu.add("Big Mac  $72");
        menu.add("Double Cheese Burger  $62");
        menu.add("Grilled BBQ Chicken Burger  $82");
        menu.add("McChicken  $44");
        menu.add("Chicken McNuggets(6pcs)  $60");
        menu.add("Chicken McNuggets(10pcs)  $100");
        menu.add("Spicy Chicken Filet Burger  $72");
        menu.add("Chicken McCrispy(2pcs)  $110");
        menu.add("Chicken McCrispy wing(2pcs)  $90");
        menu.add("Pork Burger with Cheese Source  $52");
        menu.add("Filet-O-Fish  $44");
        menu.add("Smoked Chicken Long Burger  $74");
        menu.add("Ginger Pork Long Burger  $74");
    }

    @Override
    public void print() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ") " + menu.get(i));
        }
    }

}
