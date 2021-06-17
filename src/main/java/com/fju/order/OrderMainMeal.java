package com.fju.order;

public class OrderMainMeal {

    int money;
    int currentMoney;
    
    public void setMoneyCurrentMoney(int combo) {
        switch (combo) {
            case 1 :
                currentMoney = 0;
                money += 72;
                currentMoney += 72;
                break;
            case 2 :
                currentMoney = 0;
                money += 62;
                currentMoney += 62;
                break;
            case 3 :
                currentMoney = 0;
                money += 82;
                currentMoney += 82;
                break;
            case 4 :
                currentMoney = 0;
                money += 44;
                currentMoney += 44;
                break;
            case 5 :
                currentMoney = 0;
                money += 60;
                currentMoney += 60;
                break;
            case 6 :
                currentMoney = 0;
                money += 100;
                currentMoney += 100;
                break;
            case 7 :
                currentMoney = 0;
                money += 72;
                currentMoney += 72;
                break;
            case 8 :
                currentMoney = 0;
                money += 110;
                currentMoney += 110;
                break;
            case 9 :
                currentMoney = 0;
                money += 90;
                currentMoney += 90;
                break;
            case 10 :
                currentMoney = 0;
                money += 52;
                currentMoney += 52;
                break;
            case 11 :
                currentMoney = 0;
                money += 44;
                currentMoney += 44;
                break;
            case 12 :
                currentMoney = 0;
                money += 74;
                currentMoney += 74;
                break;
            case 13 :
                currentMoney = 0;
                money += 74;
                currentMoney += 74;
                break;
        }
    }

    public int getMoney() {
        return money;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

}
