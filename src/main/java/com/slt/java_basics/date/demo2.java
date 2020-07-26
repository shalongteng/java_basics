package com.slt.java_basics.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化 DateFormat
 */
public class demo2 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /**
         * 将date类 按照格式转换为字符串
         */
        String format = dateFormat.format(date);
        /**
         *
         */
        Date date1 = dateFormat.parse("2010-1-7 21:23:44");


        System.out.println(format);
        System.out.println(date1);


    }
}
