package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 需要一种比添加很多参数更好的方法来应对变化的需求。让我们来看看更高层次的抽象。
 * 你考虑的是苹果，需要根据Apple的某些属性（比如它是绿色的吗？重量超过150克吗？）
 * 来返回一个boolean值。我们把它称为谓词（即一个返回boolean值的函数）。
 *
 * 需求： 筛选出 根据各个有可能条件 筛选出苹果
 * 实现： 使用 ApplePredicate
 * 有点： 扩展只需要 新建类即可
 * 缺点： 需要新建很多 只实例化一次的类
 */
public class Predicate06 {
    public static void main(String[] args) {
        //将行为 抽取出来
        List<Apple> appleList = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        List<Apple> heavyApples = filterApples(appleList, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(appleList, new AppleGreenColorPredicate());
        System.out.println(heavyApples.toString());
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


    //仅仅选出重的苹果
    static class AppleHeavyWeightPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return apple.getWeight()>150;
        }
    }
    //仅仅选出绿苹果
    static class AppleGreenColorPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "green".equals(apple.getColor());
        }
    }
    //筛选出重量等于150的红苹果
    static class AppleRedAndHeavyPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "red".equals(apple.getColor())
                    && apple.getWeight() > 150;
        }
    }
}
