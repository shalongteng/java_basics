package com.slt.java_basics.dsa.collections.map.jdk7;

import org.junit.Test;

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
         * hashmap中，数组长度取值2次幂的原因、
         *  当数组长度是2次幂时候，计算数组下标时候 h & (length-1) 等同于 取余
         *  与的方法效率更高。为了方法使用与运算替换取余运算。
         *
         *  为了方便rehash，假设容量是16，之前需要使用hash值的后四位进行与运算，
         *  现在看第五位如果是0，跟 之前一样，如果是1，原来下标+旧数组长度。
         */
        System.out.println(00);
    }
}
