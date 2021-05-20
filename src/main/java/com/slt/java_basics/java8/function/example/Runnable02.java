package com.slt.java_basics.java8.function.example;

/**
 * lambda 表达式
 */
public class Runnable02 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("hello world")).start();
    }
}
