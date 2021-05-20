package com.slt.java_basics.java8.function.lambda;

/**
 * 有大括号 ----- 跟普通java写法一样
 *  显示写 return
 *  需要写分号
 *
 *
 * 没有大括号时候
 *  不用写分号
 *  不用写return
 */
public class lambda01 {
    public static void main(String[] args) {
        System.out.println(add(() -> 1));
        System.out.println(add(() -> {return 1;}));
    }

    public static Integer add(IntLambda intLambda){
        return intLambda.test() + 1;
    }
    static interface IntLambda{
        Integer test();
    }
}
