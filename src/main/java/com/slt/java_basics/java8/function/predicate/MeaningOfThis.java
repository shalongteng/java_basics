package com.slt.java_basics.java8.function.predicate;

/**
 * 匿名类谜题
 * 下面的代码执行时会有什么样的输出呢，4、5、6还是42？
 */
public class MeaningOfThis {
    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;

            public void run() {
                int value = 10;
                //因为this指的是包含它的Runnable，而不是外面的类MeaningOfThis。
                System.out.println(this.value);
                System.out.println(value);
            }
        };
        r.run();
    }

    public static void main(String... args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}