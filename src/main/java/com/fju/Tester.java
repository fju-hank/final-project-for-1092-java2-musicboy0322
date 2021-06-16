package com.fju;

import com.fju.menu.MenuMainFifty;
import com.fju.menu.MenuMainMeal;
import com.fju.menu.MenuSideFifty;
import com.fju.menu.MenuSideMeal;
import com.fju.order.OrderFifty;
import com.fju.order.OrderMainMeal;
import com.fju.order.OrderSideMeal;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuMainMeal menuMainMeal = new MenuMainMeal();
        MenuSideMeal menuSideMeal = new MenuSideMeal();
        MenuMainFifty menuMainFifty = new MenuMainFifty();
        MenuSideFifty menuSideFifty = new MenuSideFifty();
        OrderMainMeal orderMainMeal = new OrderMainMeal();
        OrderSideMeal orderSideMeal = new OrderSideMeal();
        OrderFifty orderFifty = new OrderFifty();
        int total = 0;


        System.out.println("Welcome to McDonald, choose what king of combination you want to buy");
        System.out.println("1) Standard Meal");
        System.out.println("2) Fifty Dollars Meal");
        int combination = scanner.nextInt();
        if(combination == 1) {
            System.out.println("Choose your main meal");
            menuMainMeal.getMenu();
            int mainOrder = scanner.nextInt();
            total += orderMainMeal.cost(mainOrder);
            System.out.println("Total : " + total + " dollars");
            System.out.println("Choose your side meal");
            menuSideMeal.getMenu();
            int sideOrder = scanner.nextInt();
            total += orderSideMeal.cost(sideOrder);
            System.out.println("Total : " + total + " dollars");
        } else if (combination == 2) {
            System.out.println("Choose your main meal");
            menuMainFifty.getMenu();
            int fiftyMainOrder = scanner.nextInt();
            System.out.println("Choose your side meal");
            menuSideFifty.getMenu();
            int fiftySideOrder = scanner.nextInt();
            total = orderFifty.cost(fiftyMainOrder, fiftySideOrder);
            System.out.println("Total : " + total + " dollars");
        }


    }

}
