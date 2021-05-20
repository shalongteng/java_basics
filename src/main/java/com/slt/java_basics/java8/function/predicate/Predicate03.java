package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：筛选绿苹果，筛选红苹果
 * 实现： 将颜色抽取出来
 * 缺点：如果加一个颜色，就需要加一个方法
 */
public class Predicate03 {
    public static void main(String[] args) {

    }

    /**
     * 筛选各种颜色苹果
     * @return
     */
    public static List<Apple> filterApplesByColor(List<Apple> appleList,String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: appleList){
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }


}
