package com.slt.java_basics.string;

/**
 * 可变字符串
 *  stringBuffer。 线程安全
 *  stringBuilder。线程不安全
 */
public class Demo4 {
    /**
     * 对于三者使用的总结：
     *  操作少量的数据: 适用 String
     *  单线程操作字符串缓冲区下操作大量数据: 适用 StringBuilder
     *  多线程操作字符串缓冲区下操作大量数据: 适用 StringBuffer
     * @param args
     */
    public static void main(String[] args) {
        String str = "hello";


    }
}
