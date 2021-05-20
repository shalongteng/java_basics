package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 将 List 类型抽象化
 * 你可以把filter方法用在香蕉、桔子、Integer或是String的列表上了
 */
public class Predicate09 {
    public static void main(String[] args) {
        //将行为 抽取出来
        List<Apple> appleList = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        List<Apple> greenApples = filter(appleList,(Apple apple) -> "red".equals(apple.getColor()));
        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
        System.out.println(greenApples.toString());
        System.out.println("偶数： "+evenNumbers);
    }

    /**
     * 将 List 类型抽象化
     * 把filterApples方法迭代集合的逻辑
     * 与你要应用到集合中每个元素的行为（这里是一个谓词）区分开了
     * @return
     */
    public static<T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<T>();
        for (T t: list){
            if (predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}
