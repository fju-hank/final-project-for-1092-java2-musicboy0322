package com.fju.menu;

public class MenuSideFifty extends Menu {

    @Override
    public void getMenu() {
        menu.add("Small Hot Black Tea/Coffee");
        menu.add("Small Black Tea/Green Tea/Coke/Sprite");
        menu.add("Corn Soup");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ") " + menu.get(i));
        }
    }
}
