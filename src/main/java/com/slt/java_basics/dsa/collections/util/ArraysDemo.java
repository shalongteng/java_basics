package com.slt.java_basics.dsa.collections.util;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays.asList()将数组转换为集合后,底层其实还是数组，
 * 不能使用修改集合的方法 add remove clear
 */
public class ArraysDemo {
    public static void main(String[] args) {
        List myList = Arrays.asList(1, 2, 3);
        myList.add(4);//运行时报错：UnsupportedOperationException
        myList.remove(1);//运行时报错：UnsupportedOperationException
        myList.clear();//运行时报错：UnsupportedOperationException
    }
}
