package com.slt.java_basics.string;

/**
 * string equals。
 * equals 方法进行了重写。
 *
 * string 不可变
 *  final数组，数组一旦创建，长度不可变。final 常量，不可以被修改。
 *  线程安全
 */
public class Demo2 {

    public static void main(String[] args) {
        String str = new String("hello");
        String str1 = str;

        str1 += "world";
        /**
         * 对字符串进行修改，会生成一个新的对象
         */
        System.out.println(str == str1);

    }
}
