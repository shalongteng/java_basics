package com.slt.java_basics.date;

import java.util.Date;

/**
 * 时间类
 * date 大部分方法已经废弃
 * sql包下的date类，是util包下date的子类。
 */
public class demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        /**
         * CST 时区
         */

        System.out.println(date);
        System.out.println(date.getTime());
    }
}
