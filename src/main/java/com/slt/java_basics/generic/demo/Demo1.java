package com.slt.java_basics.generic.demo;

import java.util.ArrayList;

/**
 * 类型限定,把运行期异常，提前到编译期。
 *
 * 泛型本质1：把对象或者集合里的类型 ，推迟到创建集合时候。
 * 泛型本质2：类型参数化。
 *
 * 他是jdk1.5的新特性
 *
 * 数组里的元素都是一致的，跟数组学的。
 */
public class Demo1 {
    public static void main(String[] args) {
        /**
         * jdk1.7 泛型推断  可以根据左边类型 推断出右边的类型，右边不用写
         * 泛型只能用引用类型
         */
        ArrayList<String> arrayList = new ArrayList();

        /**
         * 只在右边加泛型，等于没有用泛型
         */
        ArrayList arrayList2 = new ArrayList<String>();
        arrayList.add("1");
    }
}
