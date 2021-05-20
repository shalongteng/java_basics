package com.slt.java_basics.java8.function.example;

/**
 * 匿名类
 */
public class Runnable01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();
    }
}
