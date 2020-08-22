package com.slt.java_basics.others;

import org.junit.Test;

/**
 * IntegerCache 缓存
 * JAVA的Integer有IntegerCache会缓存-128~127之间的对象。
 * 如：Integer x = 100，会调用Integer的valueOf()方法，这个方法就是返回一个Integer对象，
 * 但是在返回前，作了一个判断，判断要赋给对象的值是否在[-128,127]区间中，且IntegerCache
 * （是Integer类的内部类，里面有一个Integer对象数组，用于存放已经存在的且范围在[-128,127]中的对象）
 * 中是否存在此对象，如果存在，则直接返回引用，否则，创建一个新对象返回。
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i02 = 60; //Integer x = 60，会调用Integer的valueOf()方法
        Integer i03 = Integer.valueOf(60);
        Integer i04 = new Integer(60);

        System.out.println(i02 == 60);  //true
        System.out.println(i02 == i03);  //true 因为60位于缓存区间直接从缓存中获取

        System.out.println(i02 == i04);  //false
        System.out.println(i03 == i04);  //false
    }


    @Test
    public void Test2(){
        Integer i02 = 200;
        Integer i03 = Integer.valueOf(200);
        Integer i04 = new Integer(200);

        System.out.println(i02 == i03);  //false 因为200超出缓存区间从新创建对象
        System.out.println(i02 == 200);  //false 因为200超出缓存区间从新创建对象
        System.out.println(i02 == i04);  //false
        System.out.println(i03 == i04);  //false
    }
}
