package com.slt.java_basics.Collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * 集合排序
 *  类实现comparable接口
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * 这种排序 类需要实现comparable接口
         */
//        Collections.sort(new ArrayList<>());


        /**
         * 类不实现接口，传递一个排序规则进去
         */
        Collections.sort(new ArrayList<>(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
