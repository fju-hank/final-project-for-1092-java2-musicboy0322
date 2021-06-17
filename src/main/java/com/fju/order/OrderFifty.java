package com.fju.order;

public class OrderFifty {

    int money;
    int currentMoney;

    public void setMoneyCurrentMoney(int number1, int number2) {
        currentMoney = 0;
        money += 50;
        currentMoney += 50;
    }

    public int getMoney() {
        return money;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

}
