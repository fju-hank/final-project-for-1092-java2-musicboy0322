package com.fju.order;

public class OrderSideMeal {

    int money;
    int currentMoney;

    public void setMoneyCurrentMoney(int number) {
        switch (number) {
            case 1 :
                currentMoney = 0;
                money += 55;
                currentMoney += 55;
                break;
            case 2 :
                currentMoney = 0;
                money += 55;
                currentMoney += 55;
                break;
            case 3 :
                currentMoney = 0;
                money += 65;
                currentMoney += 65;
                break;
            case 4 :
                currentMoney = 0;
                money += 68;
                currentMoney += 68;
                break;
            case 5 :
                currentMoney = 0;
                money += 79;
                currentMoney += 79;
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
