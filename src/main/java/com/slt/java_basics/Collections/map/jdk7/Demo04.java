package com.slt.java_basics.Collections.map.jdk7;

/**
 * https://www.cnblogs.com/DiZhang/p/12544875.html
 *
 * LinkedHashMap<K,V> extends HashMap<K,V>
 *     HashMap 是一个无序的 Map，因为每次根据 key 的 hash值映射到 Entry 数组上，所以遍历出来的顺序并不是写入的顺序。
 *     通过维护一个运行于所有条目的双向链表，LinkedHashMap保证了元素插入的顺序。
 */
public class Demo04 {
    /**
     * 1、LinkedHashMap可以认为是HashMap + LinkedList，
     *  即它既使用HashMap操作数据结构，又使用LinkedList维护插入元素的先后顺序
     * @param args
     */
    public static void main(String[] args) {
        /**
         * accessOrder
         *  true表示最近最少使用次序，false表示插入顺序
         *
         */
    }
}

