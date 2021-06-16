package com.fju.menu;


public class MenuSideMeal extends Menu {

    @Override
    public void getMenu() {
        menu.add("Medium Fries and Cold/Hot Drink  $55");
        menu.add("Salad and Cold/Hot Drink  $55");
        menu.add("Oreo Ice Cream and Cold/Hot Drink  $65");
        menu.add("Chicken McCrispy(Wing)(1pcs) and Cold/Hot Drink  $68");
        menu.add("Crispy Chicken and Small Fries and Cold/Hot Drink  $79");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ") " + menu.get(i));
        }
    }
}
