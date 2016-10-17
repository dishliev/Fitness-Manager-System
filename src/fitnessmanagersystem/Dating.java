/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessmanagersystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dating {

    public static void main(String[] args) {

        String startDate = "2014/09/12 00:00";
        String endDate = "2014/09/13 00:00";

        try {
            Date start = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
                    .parse(startDate);
            Date end = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
                    .parse(endDate);

            System.out.println(start);
            System.out.println(end);

            if (start.compareTo(end) > 0) {
                System.out.println("start is after end");
            } else if (start.compareTo(end) < 0) {
                System.out.println("start is before end");
            } else if (start.compareTo(end) == 0) {
                System.out.println("start is equal to end");
            } else {
                System.out.println("Something weird happened...");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}