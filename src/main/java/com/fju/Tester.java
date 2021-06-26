package com.fju;

import com.fju.voucher.Voucher;
import com.fju.menu.*;
import com.fju.order.OrderFifty;
import com.fju.order.OrderMainMeal;
import com.fju.order.OrderSideMeal;
import com.fju.time.CurrentTime;

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
        CurrentTime instantTime = new CurrentTime();
        Voucher voucher = new Voucher();

        System.out.print("Welcome to McDonald's, choose what kind of combination you want to buy( Current Time is " );
        instantTime.getTime();
        while(true) {
            int total = orderMainMeal.getMoney() + orderSideMeal.getMoney() + orderFifty.getMoney();
            System.out.println("1) Standard Meal");
            System.out.println("2) Fifty Dollars Meal");
            System.out.println("3) Finish");
            int combination = scanner.nextInt();
            if(combination == 1) {
                System.out.println("1) Combo");
                System.out.println("2) A la carte");
                int mealChoice = scanner.nextInt();
                if (mealChoice == 1) {
                    System.out.println("Choose your main meal");
                    menuMainMeal.print();
                    int mainOrder = scanner.nextInt();
                    orderMainMeal.setMoneyCurrentMoney(mainOrder);
                    System.out.println("Total : " +  (total + orderMainMeal.getCurrentMoney()) + " dollars");
                    System.out.println("Choose your side meal");
                    menuSideMeal.print();
                    int sideOrder = scanner.nextInt();
                    orderSideMeal.setMoneyCurrentMoney(sideOrder);
                    System.out.println("Total : " + (total + orderSideMeal.getCurrentMoney() + orderMainMeal.getCurrentMoney()) + " dollars");
                } else if (mealChoice == 2) {
                    System.out.println("Choose your main meal");
                    menuMainMeal.print();
                    int mainOrder = scanner.nextInt();
                    orderMainMeal.setMoneyCurrentMoney(mainOrder);
                    System.out.println("Total : " +  (total + orderMainMeal.getCurrentMoney()) + " dollars");
                }
            } else if (combination == 2) {
                System.out.println("Choose your main meal");
                menuMainFifty.print();
                int fiftyMainOrder = scanner.nextInt();
                System.out.println("Choose your side meal");
                menuSideFifty.print();
                int fiftySideOrder = scanner.nextInt();
                orderFifty.setMoneyCurrentMoney(fiftyMainOrder, fiftySideOrder);
                System.out.println("Total : " + (total + orderFifty.getCurrentMoney()) + " dollars");
            } else if (combination == 3) {
                System.out.println("Total is " + total + " dollars");
                break;
            }
        }
        System.out.println("Because we have a promotion now, please type your name to get your voucher");
        scanner.next();
        voucher.vouchers();
    }

}
