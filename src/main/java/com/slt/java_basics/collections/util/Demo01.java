package com.slt.java_basics.collections.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections
 */
public class Demo01 {
    List<Integer> list = new ArrayList<>();
    List<Person> list2 = new ArrayList<>();

    @Before
    public void init(){
        list.add(-1);
        list.add(3);
        list.add(3);
        list.add(-5);
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(-7);

        list2.add(new Person("张三"));
        list2.add(new Person("李四"));
        list2.add(new Person("王五"));
    }

    /**
     * 二分查找：
     * 判断传入的 list 是否 RamdomAccess 的实例，如果是，调用indexedBinarySearch()方法，
     * 如果不是，那么调用iteratorBinarySearch()方法
     */
    @Test
    public void testBinarySearch(){
        /**
         * List<? extends Comparable<? super T>> list
         */
        System.out.println(Collections.binarySearch(list, 2));
    }
    @Test
    public void testCompare(){
        System.out.println("原始数组:");
        System.out.println(list);
        // void reverse(List list)：反转
        Collections.reverse(list);
        System.out.println("数组反转:");
        System.out.println(list);

        // void sort(List list),按自然排序的升序排序
        Collections.sort(list);
        System.out.println("自然排序的升序排序:");
        System.out.println(list);

        // 定制排序的用法
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后：");
        System.out.println(list);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person{
    private String name;

}
