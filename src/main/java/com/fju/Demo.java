package com.fju;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://github.com/musicboy0322/class/tree/master/src/main/java/test/mcdonalds");
            HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            String line = in.readLine();
            while(line != null) {
                sb.append(line);
                line = in.readLine();
            }
            System.out.println(sb.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
