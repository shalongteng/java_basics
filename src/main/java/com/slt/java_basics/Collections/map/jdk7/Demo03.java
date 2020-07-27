package com.slt.java_basics.Collections.map.jdk7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 多线程下[HashMap]的问题
 *  1、多线程put操作后，get操作导致 死循环。。。
 *  2、多线程put非NULL元素后，get操作得到NULL值。
 *  3、多线程put操作，导致元素丢失。
 */
public class Demo03 {

    /**
     * 如果两个线程同时操作map的put方法，都需要resize时候，第一个线程
     * 运行到Entry<K,V> next = e.next; 挂起了，第二个线程rehash完毕。
     * 第一个线程继续rehash过程，有可能造成死循环。这时候调用get方法。cpu飙升到100%。
     */
    @Test
    public void testMap2(){
        /**
         */
        System.out.println(00);
    }
}
