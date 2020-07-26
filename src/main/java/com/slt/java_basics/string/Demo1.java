package com.slt.java_basics.string;

/**
 * string 里有一个final数组， 修改string时候，就是在创建一个新的对象。
 * string 对象创建之后，会在字符串常量池中，进行缓存。
 * string 类被final修饰，不可被继承。
 *
 * 实现的接口：
 *  Serializable
 *  Comparable
 *  CharSequence
 */
public class Demo1 {

    public static void main(String[] args) {
        /**
         * new 的方式放在堆中。
         */
        String s = new String("hello");

        /**
         * 二.String中的享元模式
         *
         * 享元模式（Flyweight）可以粗略的理解为缓存（cache），是设计中的一种优化策列。
         * string通过这种常量池中相同常量共享对象的方式实现了类似于缓存的享元模式设计
         *
         * 常量池(constant pool)指的是在编译期被确定，并被保存在已编译的.class文件中的一些数据。
         *
         * 它包括了关于类、方法、接口等中的常量，也包括字符串常量。
         *
         */
        String str = "hello";
        String str2 = "hello";

        System.out.println(str2==str);

        System.out.println(str.charAt(2));
    }
}
