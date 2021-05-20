package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：筛选绿苹果
 */
public class Predicate01 {
    public static void main(String[] args) {

    }

    /**
     * 筛选绿苹果
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> appleList) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: appleList){
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
