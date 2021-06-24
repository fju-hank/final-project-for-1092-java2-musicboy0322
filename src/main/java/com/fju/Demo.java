package com.fju;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.TimeZone;

public class Demo {

    public static void main(String[] args) {

        String google = "https://www.google.com";
        try {
            URL url = new URL(google);
            URLConnection connection = url.openConnection();
            connection.connect();
            Long mileSecond = connection.getDate();
            Date date = new Date(mileSecond);
            System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + " )");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
