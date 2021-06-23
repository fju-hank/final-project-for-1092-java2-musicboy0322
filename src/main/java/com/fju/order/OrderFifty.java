package com.fju.order;

public class OrderFifty {

    int money;
    int currentMoney;

    public void setMoneyCurrentMoney(int order1, int order2) {
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
