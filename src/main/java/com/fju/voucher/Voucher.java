package com.fju.voucher;

import java.io.*;
import java.util.Random;

public class Voucher {

    String voucher;

    public void vouchers() {
        try {
            FileInputStream fis = new FileInputStream("/Users/mac/IdeaProjects/final-project-for-1092-java2-musicboy0322/src/main/java/com/fju/voucher/voucher.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            Random random = new Random();
            for (int i = 0; i < random.nextInt(3) + 1; i++) {
                voucher = br.readLine();
            }
            System.out.println("Your voucher is \"" + voucher + "\"");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
