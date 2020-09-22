package com.slt.java_basics.collections.list;

import org.junit.Test;

import java.util.Arrays;

/**
 *  ArrayList 底层是数组实现 读快改慢
 *  默认容量10
 */
public class Demo1 {
    /**
     * 思考：elementData被标记为transient，那么它的序列化和反序列化是如何实现的呢？
     *  ArrayList自定义了它的序列化和反序列化方式。详情请查看
     *  writeObject(java.io.ObjectOutputStream s)和
     *  readObject(java.io.ObjectOutputStream s)方法。
     */
    public static void main(String[] args) {

    }

    /**
     * Arrays.copyOf() 返回一个新的数组
     */
    @Test
    public void testArrays(){
        String [] strings  = new String[2];
        strings[0]  = "hello";
        strings[1]  = "slt";
        String[] strings1 = Arrays.copyOf(strings, 1);
        System.out.println(Arrays.toString(strings1));
    }

    /**
     * 将指定源数组中的数组从指定位置复制到目标数组的指定位置。
     */
    @Test
    public void testSystem(){
        String [] strings  = new String[3];
        String [] strings2  = new String[3];
        strings[0]  = "11";
        strings[1]  = "22";
        strings[2]  = "33";
        /**
         * src - 源数组。
         * srcPos - 源数组中的起始位置。
         * dest - 目标数组。
         * destPos - 目的地数据中的起始位置。
         * length - 要复制的源数组元素的数量。
         */
        System.arraycopy(strings,0,strings2,1,2);
        System.out.println(Arrays.toString(strings2));
        /**
         *
         */
        System.arraycopy(strings,0,strings,1,2);
        System.out.println(Arrays.toString(strings));
    }
}
