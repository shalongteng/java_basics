package com.slt.java_basics.date;

import java.util.Calendar;
import java.util.Date;

/**
 * calendar 类
 */
public class demo3 {
    public static void main(String[] args) {
        /**
         *
         */
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());



        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONDAY));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
