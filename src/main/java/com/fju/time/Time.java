package com.fju.time;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.TimeZone;

public class Time {

    public void getTime() {

        String google = "http://www.google.com";
        try {
            URL url = new URL(google);
            URLConnection connection = url.openConnection();
            connection.connect();
            Long mileSeconds = connection.getDate();
            Date date = new Date(mileSeconds);
            System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + " )");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
