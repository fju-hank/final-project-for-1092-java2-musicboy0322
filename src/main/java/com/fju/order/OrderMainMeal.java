package com.fju.order;

public class OrderMainMeal {

    int money;
    
    public int cost(int combo) {
        switch (combo) {
            case 1 :
                money += 72;
                break;
            case 2 :
                money += 62;
                break;
            case 3 :
                money += 82;
                break;
            case 4 :
                money += 44;
                break;
            case 5 :
                money += 60;
                break;
            case 6 :
                money += 100;
                break;
            case 7 :
                money += 72;
                break;
            case 8 :
                money += 110;
                break;
            case 9 :
                money += 90;
                break;
            case 10 :
                money += 52;
                break;
            case 11 :
                money += 44;
                break;
            case 12 :
                money += 74;
                break;
            case 13 :
                money += 74;
                break;
        }
        return money;
    }

}
