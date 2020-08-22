package com.slt.java_basics.designPatterns.Singleton;

/**
 * 但是无法防止通过反射获取多个对象
 * 通过枚举可以
 */
public enum SingletonEnum {
    INSTANCE;
}
