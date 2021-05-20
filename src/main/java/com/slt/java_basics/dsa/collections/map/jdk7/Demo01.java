package com.slt.java_basics.dsa.collections.map.jdk7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map 接口
 *  hashMap
 *  linkedHashMap
 *  treeMap  红黑树（自平衡的排序二叉树）
 *  ConcurrentHashMap
 */
public class Demo01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "PHP");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    @Test
    public void testMap(){
        System.out.println(00);
    }
}
