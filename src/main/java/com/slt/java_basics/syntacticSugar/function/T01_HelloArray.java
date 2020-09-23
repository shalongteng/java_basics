package com.slt.java_basics.syntacticSugar.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class T01_HelloArray {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        /**
         * 函数式编程是声明式的：
         * 你要做的只是提出你的要求，声明你的用意即可。
         */
        list.stream().forEach(System.out::print);
        System.out.println();
        /**
         * 不变模式
         * 看似对每一个值加一，实际上并没有对数组进行修改
         */
        Arrays.stream(a).map(i->i+1).forEach(System.out::print);
        System.out.println();
        Arrays.stream(a).forEach(System.out::print);

        /**
         * 更简洁
         */
        Arrays.stream(a).map(x->(x%2==0?x:x+1)).forEach(System.out::println);
    }
}
