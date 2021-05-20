package com.slt.java_basics.java8.function.predicate;

import java8.common.Apple;

/**
 * 谓词 即一个返回boolean值的函数
 * 选择苹果的不同策略
 */
@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}