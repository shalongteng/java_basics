package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：筛选绿苹果，筛选红苹果
 * 只能在写一个方法
 * 缺点：如果加一个颜色，就需要加一个方法
 */
public class Predicate02 {
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

    /**
     * 筛选红苹果
     * @param appleList
     * @return
     */
    public static List<Apple> filterRedApples(List<Apple> appleList) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: appleList){
            if ("red".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
