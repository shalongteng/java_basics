package com.slt.java_basics.Collections.map.jdk7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * java version "1.7.0_80"
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(00);
        Map map = new HashMap(16);
    }

    /**
     * hashmap中，数组长度取值2次幂的原因、
     *  当数组长度是2次幂时候，计算数组下标时候 h & (length-1) 等同于 取余
     *  与的方法效率更高。为了方法使用与运算替换取余运算。
     *
     *  为了方便rehash，假设容量是16，之前需要使用hash值的后四位进行与运算，
     *  现在看第五位如果是0，跟 之前一样，如果是1，原来下标+旧数组长度。
     */
    @Test
    public void testMap(){
        System.out.println(00);
    }
}
