package com.slt.java_basics.designPatterns.Singleton;

/**
 * 饿汉模式。
 */
public class Singleton2 {
    private Singleton2() {}  //私有构造函数
    private static Singleton2 instance = new Singleton2();  //单例对象
    //静态工厂方法
    public static Singleton2 getInstance() {
        return instance;
    }
}
