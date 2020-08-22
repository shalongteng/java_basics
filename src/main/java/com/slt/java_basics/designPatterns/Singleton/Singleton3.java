package com.slt.java_basics.designPatterns.Singleton;

/**
 * 懒汉模式。
 */
public class Singleton3 {
    private Singleton3() {}  //私有构造函数
    private static Singleton3 instance = null;  //单例对象
    //静态工厂方法
    /**
     * 线程不安全
     * 如果两个线程同时判断 instance == null 成立，
     * 这样一来，显然instance被构建了两次。
     *
     * 如果在方法前加synchronized，效率太低
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
