package com.slt.java_basics.Collections.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://blog.csdn.net/panweiwei1994/article/details/77110354
 *
 * list接口
 *  LinkedList 底层是链表实现 读慢改快
 *  默认容量10
 */
public class Demo2 {
    /**
     * LinkedList还添加了可以使其用作栈、队列或双端队列的方法
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("11");
        linkedList.add("22");
    }

}