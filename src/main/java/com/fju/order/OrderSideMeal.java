package com.fju.order;

public class OrderSideMeal {

    int money;

    public int cost(int number) {
        switch (number) {
            case 1 :
                money += 55;
                break;
            case 2 :
                money += 55;
                break;
            case 3 :
                money += 65;
                break;
            case 4 :
                money += 68;
                break;
            case 5 :
                money += 79;
                break;
        }
        return money;
    }
}
