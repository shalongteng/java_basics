package com.slt.java_basics.Collections.collection;

import org.junit.Test;

import java.util.*;

/**
 * set   是无序的，是通过hash值来决定元素的位置
 * list  是有序的
 *
 * 集合遍历
 *  增强for
 *  普通for
 *  Iterator
 */
public class Demo02 {
    /**
     * Iterator 使用的是快速失败（fail-fast）机制，一旦监测到在迭代过程中集合中的元素被修改，
     * 立即抛出 ConcurrentModificationException 异常
     *
     * Iterator 是工作在一个独立的线程中，并且拥有一个 mutex 锁。 Iterator 被创建之后
     * 会建立一个指向原来集合的单链索引表，当原来的集合数量发生变化时，这个索引表的内容
     * 不会同步改变，当索引指针往后移动的时候就找不到要迭代的对象，按照 fail-fast 原则 
     * Iterator 会马上抛出 java.util.ConcurrentModificationException 异常。  
     *
     * 所以 Iterator 在工作的时候是不允许被迭代的对象被改变的，但可以使用 Iterator 本身的方法 
     * remove() 来删除对象，Iterator.remove() 方法会在删除当前迭代对象的同时维护索引的一致性。
     */
    @Test
    public void testIterator(){
        List<String> list = new ArrayList();

        list.add("11");
        list.add("22");
        list.add("33");
        /**
         * Iterator 遍历时候不能调用容器的remove方法
         */
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            list.remove(next);
        }

        System.out.println(list);

    }

    /**
     * 每删除一个元素时，集合的size会发生变化，删除会有遗漏，
     * 所以建议使用迭代器Iterator对集合进行动态删除操作。
     */
    @Test
    public void testGeneralFor(){
        List<String> list = new ArrayList();

        list.add("11");
        list.add("22");
        list.add("33");
        /**
         * 而普通for可以动态删除。
         * 每次删除一个，list.size 会发生变化，并且list里的元素下标也会变化。
         */
        for(int i =0;i<list.size();i++){
            list.remove(i);
        }
        System.out.println(list);

    }

    /**
     * 增强for循环内部是使用的Iterator来遍历的
     */
    @Test
    public void testEnhancedFor(){
        List<String> list = new ArrayList();

        list.add("11");
        list.add("22");
        list.add("33");
        /**
         * EnhancedFor 增强 for循环
         * 只能读，不能改。
         *
         * 遍历时候不能调用容器的remove方法
         * 增强for无法动态删除
         */
        for (String s : list) {
        }

    }

}

