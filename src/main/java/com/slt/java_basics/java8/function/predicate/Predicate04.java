package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求： 筛选出 轻重 苹果
 * 实现： 将颜色抽取出来
 * 缺点： 跟颜色方法一样，如果要修改遍历提升性能，那么就需要修改所有方法的遍历。
 */
public class Predicate04 {
    public static void main(String[] args) {

    }

    /**
     * 筛选各种 重量 苹果
     * @return
     */
    public static List<Apple> filterApplesByWeight(List<Apple> appleList,String weight) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: appleList){
            if (weight.equals(apple.getWeight())) {
                result.add(apple);
            }
        }
        return result;
    }


}
