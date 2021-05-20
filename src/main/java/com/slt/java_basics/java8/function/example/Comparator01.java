package com.slt.java_basics.java8.function.example;

import java8.common.Apple;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 使用匿名类
 */
public class Comparator01 {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        //排序方法1
        appleList.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        System.out.println(appleList);

        //排序方法2
        Collections.sort(appleList, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return -o1.getWeight().compareTo(o2.getWeight());
            }
        });
        System.out.println(appleList);

    }
}
