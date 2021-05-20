package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求： 筛选出 轻重 苹果,并且筛选出颜色
 * 实现： 使用一个标志 flag 表明 本次调用 使用的是颜色还是 重量
 * 缺点： 很笨拙，如果 需求在变，方法就不适用了。
 */
public class Predicate05 {
    public static void main(String[] args) {

    }

    /**
     * 筛选各种 重量 苹果
     * @return
     */
    public static List<Apple> filterApples(List<Apple> appleList,String weight,String color,boolean flag) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: appleList){
            if ((flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight().equals(weight))){
                result.add(apple);
            }
        }
        return result;
    }


}
