package com.slt.java_basics.string;

/**
 * string intern。
 *  如果常量池中存在，直接返回。
 *  如果不存在，在常量池中创建，并返回。
 *
 * 在hashmap中使用string作为可以优势：
 *  string 中缓存了hashcode
 */
public class Demo3 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = new String("hello");

        System.out.println(str == str2.intern());
        System.out.println(str == str2);

    }
}
