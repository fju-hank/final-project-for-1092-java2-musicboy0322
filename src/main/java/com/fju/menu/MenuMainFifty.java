package com.fju.menu;

public class MenuMainFifty extends Menu {

    @Override
    public void getMenu() {
        menu.add("Beef Burger");
        menu.add("Chicken McNuggets(4pcs)");
        menu.add("Small Fries");
        menu.add("Apple Pie");
        menu.add("Big Ice Cream");
        menu.add("French Mustard Chicken Burger");
        menu.add("Spicy Chicken wing(2pcs)");
        menu.add("Grilled BBQ Chicken wing(2pcs)");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ") " + menu.get(i));
        }
    }
}
