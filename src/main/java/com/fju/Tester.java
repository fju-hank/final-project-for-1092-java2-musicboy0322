package com.fju;

import com.fju.menu.MenuMainFifty;
import com.fju.menu.MenuMainMeal;
import com.fju.menu.MenuSideFifty;
import com.fju.menu.MenuSideMeal;
import com.fju.order.OrderSideMeal;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuMainMeal mainMeal = new MenuMainMeal();
        MenuSideMeal sideMeal = new MenuSideMeal();
        MenuMainFifty mainFifty = new MenuMainFifty();
        MenuSideFifty sideFifty = new MenuSideFifty();

        System.out.println("Welcome to McDonald, choose what king of combination you want to buy");
        System.out.println("1) Standard Meal");
        System.out.println("2) Fifty Dollars Meal");
        int combination = scanner.nextInt();
        if(combination == 1) {
            System.out.println("Choose your main meal");
            mainMeal.getMenu();
            int mainOrder = scanner.nextInt();
            System.out.println("Choose your side meal");
            sideMeal.getMenu();
            int sideOrder = scanner.nextInt();
        } else if (combination == 2) {
            System.out.println("Choose your main meal");
            mainFifty.getMenu();
            int fiftyMainOrder = scanner.nextInt();
            System.out.println("Choose your side meal");
            sideFifty.getMenu();
            int fiftySideOrder = scanner.nextInt();
        }


    }

}
