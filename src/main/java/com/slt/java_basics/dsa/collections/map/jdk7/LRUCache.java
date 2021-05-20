package com.slt.java_basics.dsa.collections.map.jdk7;

import java.util.LinkedHashMap;

/**
 * LRU是Least Recently Used的缩写
 *
 * 每次访问都把访问的那个数据移到双向队列的尾部去，那么每次要淘汰数据的时候，
 * 双向队列最头的那个数据不就是最不常访问的那个数据了,双向链表最头的那个数据就是要淘汰的数据。
 *
 * “访问”，这个词有两层意思：
 * 1、根据Key拿到Value，也就是get方法
 * 2、修改Key对应的Value，也就是put方法
 */
public class LRUCache extends LinkedHashMap {
    private static final long serialVersionUID = 1L;
    protected int maxElements;

    public LRUCache(int maxSize) {
        super(maxSize, 0.75F, true);
        maxElements = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry eldest) {
        return size() > maxElements;
    }
}
