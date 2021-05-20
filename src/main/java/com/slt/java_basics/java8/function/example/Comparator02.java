package com.slt.java_basics.java8.function.example;

import java8.common.Apple;

import java.util.Arrays;
import java.util.List;

/**
 * 使用lambda
 */
public class Comparator02 {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        //排序方法1
        appleList.sort((Apple apple1,Apple apple2) -> apple1.getWeight().compareTo(apple2.getWeight()));
        System.out.println(appleList);

    }
}
