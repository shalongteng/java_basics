package com.slt.java_basics.syntacticSugar.function;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

/**
 * test stream 的api
 */
public class T03_Stream {
    public List<Integer> list;
    @Before
    public void list(){
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    /**
     * Predicate 用于判断对象是否符合某个条件，经常被用来过滤对象。
     */
    @Test
    public void testStream01(){
        long count = list.stream().filter(p -> p > 2).count();
        List<Integer> collect = list.stream().filter(p -> p > 2).collect(toList());
        System.out.println(count);
        System.out.println(collect);
    }

    /**
     * 一个函数可以将一种类型的值转换成另外一种类型，map 操作就可以使用该函数，将一个流中的值转换成一个新的流。
     */
    @Test
    public void testStreamMap(){
        List<String> collected = Stream.of("a", "b", "hello")
                .map(a -> a.toUpperCase())
                .collect(toList());
        System.out.println(collected);
    }

    /**
     * filter 方法就是接受的一个 Predicate 的匿名函数类，判断对象是否符合条件，符合条件的才保留下来。
     */
    @Test
    public void testStreamFilter(){
        List<String> beginningWithNumbers = Stream.of("a", "1abc", "abc1")
                        .filter(value -> isDigit(value.charAt(0)))
                        .collect(toList());
        System.out.println(beginningWithNumbers);
    }

    /**
     * flatMap 方法可用 Stream 替换值，然后将多个 Stream 连接成一个 Stream。
     * flatMap 最常用的操作就是合并多个 Collection。
     */
    @Test
    public void testStreamFlatMap(){
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());

        System.out.println(together);
        //[[1, 2], [3, 4]]  list里包含两个小list  在最外层套了一层list，将自己的list作为一个元素
        List<List<Integer>> collect = Stream.of(asList(1, 2), asList(3, 4)).collect(toList());
        System.out.println(collect);
    }

    /**
     * Optional 对象封装的就是实际的值，可能为空，所以保险起见，可以先用 isPresent() 方法判断一下。
     * Optional 的引入就是为了解决方法返回 null 的问题。
     */
    @Test
    public void testStreamMaxAndMin(){
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        if(max.isPresent()){
            System.out.println(max.get());
        }

    }

    /**
     *  reduce 的第一个参数，这是一个初始值。0 + 1 + 2 + 3 + 4 = 10。
     */
    @Test
    public void testStreamReduce(){
        int result = Stream.of(1, 2, 3, 4)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(result);

    }
}
