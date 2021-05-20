package com.slt.java_basics.dsa.collections.list;

import java.util.LinkedList;

/**
 * https://blog.csdn.net/panweiwei1994/article/details/77110354
 *
 *  LinkedList 底层使用的是双向链表  读慢改快
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
