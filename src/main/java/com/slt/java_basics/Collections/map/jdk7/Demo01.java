package com.slt.java_basics.Collections.map.jdk7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(00);
//        Map map = new HashMap(16);
    }

    /**
     * hashmap中，数组长度取值2次幂的原因、
     *  当数组长度是2次幂时候，计算数组下标时候 h & (length-1) 等同于 取余
     *  与的方法效率更高。
     */
    @Test
    public void testMap(){
        System.out.println(00);
    }
}
