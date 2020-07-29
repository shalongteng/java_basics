package com.slt.java_basics.Collections.set;

/**
 * set
 *  LinkedHashSet extends HashSet
 *  底层维护了一个map
 *  map的value 是一个空的object对象。
 */
public class Demo02 {

    /**
     *     hashset 有一个构造器，初始化了一个LinkedHashMap。所有的LinkedHashSet
     *     全部调用的这个构造器。也就是说LinkedHashSet他的功能是用初始化了一个LinkedHashMap
     *     来完成的。
     *
     *     HashSet(int initialCapacity, float loadFactor, boolean dummy) {
     *         map = new LinkedHashMap<>(initialCapacity, loadFactor);
     *     }
     */
}
