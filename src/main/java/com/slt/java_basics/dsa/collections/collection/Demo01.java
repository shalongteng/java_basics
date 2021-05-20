package com.slt.java_basics.dsa.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 容器接口
 *  collection
 *      list 可重复  ArrayList linkedlist CopyOnWriteArrayList
 *      set  不可重复 HashSet TreeSet
 */
public class Demo01 {
    /**
     * 一流公司卖标准
     * 二流公司卖服务
     * 三流公司卖产品
     */

    /**
     * 重写equals 方法必须 重写 hashcode方法、
     * 对象相等，那么他的hashcode也是相等的。
     *
     * hashcode的 使用：
     *  在hash表中作为key的时候，比如set判断是否重复的时候。
     *  就好像查字典，如果字母索引不相同，则value肯定不同。如果字母索引相同，再去
     *      比对value值，提高效率。
     */
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add("a");
        collection.add(collection);
        System.out.println(collection);
    }
}
