package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 使用 匿名类
 *
 * 需求： 筛选出 根据各个有可能条件 筛选出苹果
 * 实现： 使用 匿名类
 * 缺点： 很笨重，因为它占用了很多空间
 */
public class Predicate07 {
    public static void main(String[] args) {
        //将行为 抽取出来
        List<Apple> appleList = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        List<Apple> greenApples = filterApples(appleList, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        System.out.println(greenApples.toString());
    }

    /**
     * 筛选各种 重量 苹果
     * 把filterApples方法迭代集合的逻辑
     * 与你要应用到集合中每个元素的行为（这里是一个谓词）区分开了
     * @return
     */
    public static List<Apple> filterApples(List<Apple> appleList,ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: appleList){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
