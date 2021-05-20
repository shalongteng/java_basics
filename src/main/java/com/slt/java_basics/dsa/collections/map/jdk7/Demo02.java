package com.slt.java_basics.dsa.collections.map.jdk7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://blog.csdn.net/u011240877/article/details/52949046
 *
 * AbstractMap
 *  AbstractMap 是 Map 接口的的实现类之一，也是 HashMap, TreeMap, ConcurrentHashMap 等类的父类。
 *  唯一的抽象方法
 *      public abstract Set<Entry<K,V>> entrySet();
 *      当我们要实现一个 不可变的 Map 时，只需要继承这个类，然后实现 entrySet() 方法，这个方法返回一个保存所有 key-value 映射的 set。
 *      通常这个 Set 不支持 add(), remove() 方法，Set 对应的迭代器也不支持 remove() 方法。
 *
 * 如果想要实现一个 可变的 Map,我们需要在上述操作外，重写 put() 方法，因为 默认不支持 put 操作：
 *  抽象类不能通过new关键字创建抽象类的实例，但它可以有构造方法。AbstractMap提供了一个protected的无参构造方法，
 *      意味着只有它的子类才能访问
 */
public class Demo02 {
    /**
     * Map中其内部定义了一个Entry接口，key-value存储在这个Map.Entry中。
     * AbstractMap对这个内部接口进行了实现，
     * 一共有两个：一个是可变的SimpleEntry和一个是不可变的SimpleImmutableEntry。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(00);
        Map map = new HashMap(16);
    }

    /**
     * 三个主要的视图
     *  entrySet
     *  keyset
     *  values
     */
    @Test
    public void testMap(){
        System.out.println(00);
    }

    @Test
    public void testMap2(){
        /**
         * key为null，则hash是0，所以对数组取余数也是0
         *  所以只能放在table[0]
         * 新插入或者扩容时候重新分配元素，采用的都是头插法
         */
        System.out.println(00);
    }
}
