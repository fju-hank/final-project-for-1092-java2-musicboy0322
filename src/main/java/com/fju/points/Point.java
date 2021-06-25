package com.fju.points;

public class Point extends Thread {

    int point;
    int total;

    @Override
    public void run() {
        point = total / 10;
    }


    public void getTotal(int total) {
        this.total = total;
    }

    public int getPoint() {
        return point;
    }



}
