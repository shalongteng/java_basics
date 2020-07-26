package com.slt.java_basics.generic.demo;


/**
 * 泛型擦除：
 *  C++ 中模板的实例化会为每一种类型都产生一套不同的代码，这就是所谓的代码膨胀。
 *  Java 中并不会产生这个问题。虚拟机中并没有泛型类型对象，所有的对象都是普通类。
 *
 *  擦除规则：
 *      若泛型类型没有指定具体类型，用Object作为原始类型；
 *      若有限定类型< T exnteds XClass >，使用XClass作为原始类型；
 *      若有多个限定< T exnteds XClass1 & XClass2 >，使用第一个边界类型XClass1作为原始类型；
 */
public class Demo4 {
    public static void main(String[] args) {
        /**
         *由于 Java 泛型的类型参数之实际类型在编译时会被消除，所以无法在运行时得知其类型参数的类型。
         *JVM并不知道泛型的存在，因为泛型在编译阶段就已经被处理成普通的类和方法；
         *泛型擦除：其目的是避免过多的创建类而造成的运行时的过度消耗
         */


        /**
         * 泛型的约束是在编译时约束的，真正运行的 class 是没有泛型约束的。所以通过反射，
         * 可以加入任何类型
         */
    }
}
