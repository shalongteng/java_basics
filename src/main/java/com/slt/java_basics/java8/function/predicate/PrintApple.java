package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 测验2.1：编写灵活的prettyPrintApple方法
 * 编写一个prettyPrintApple方法，它接受一个Apple的List，以
 * 多种方式根据苹果生成一个String输出（有点儿像多个可定制的toString方法）。
 * 只打印每个苹果的重量。
 * 你可以让prettyPrintApple方法分别打印每个苹果，然后说明它是重的还是轻的。
 */
public class PrintApple {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(100,"green"));
        appleList.add(new Apple(155,"red"));
        //缺点：你需要声明很多只要实例化一次的类
        prettyPrintApple(appleList, new AppleSimpleFormatter());
    }

    /**
     * 你需要一种表示接受Apple并返回一个格式String值的方法。
     * 把行为 抽出来
     * @param appleList
     * @param appleFormatter
     */
    public static void prettyPrintApple(List<Apple> appleList, AppleFormatter appleFormatter){
        for (Apple apple : appleList) {
            String accept = appleFormatter.accept(apple);
            System.out.println(accept);
        }
    }

    static class AppleSimpleFormatter implements AppleFormatter{
        public String accept(Apple apple){
            return "An apple of " + apple.getWeight() + "g";
        }
    }
}
