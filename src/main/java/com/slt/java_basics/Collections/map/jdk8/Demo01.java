package com.slt.java_basics.Collections.map.jdk8;

/**
 * jdk8 hashmap 数组+链表+红黑树
 *  当链表长度达到8的时候，会转为红黑树。
 *  树形转链表的阈值是6.
 *  容器可以树化的最小容量64；
 */
public class Demo01 {
    /**
     * 在 JDK1.7 的时候，ConcurrentHashMap（分段锁） 对整个桶数组进行了分割分段(Segment)，
     * 每一把锁只锁容器其中一部分数据，多线程访问容器里不同数据段的数据，就不会存在锁竞争，提高并发访问率。
     *
     * 到了 JDK1.8 的时候已经摒弃了 Segment 的概念，而是直接用 Node 数组+链表+红黑树的数据结构来实现，
     * 并发控制使用 synchronized 和 CAS 来操作。
     */
}
