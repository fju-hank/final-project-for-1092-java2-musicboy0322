package com.fju.points;

public class Point extends Thread {

    int point;
    int total;
    Thread thread;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            point = total / 10;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void getTotal(int total) {
        this.total = total;
    }

    public int getPoint() {
        return point;
    }



}
