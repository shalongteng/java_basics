package com.slt.java_basics.callback;

/**
 * @Auther:
 * @Date: 2019/1/17 16:32
 * @Description:
 */
public class RunningTime {
    /**
     * 一个用来被测试的方法，进行了一个比较耗时的循环
     */
    public static void testMethod() {
        for (int i = 0; i < 1000000000l; i++) {

        }
    }

    /**
     * 一个简单的测试方法执行时间的方法
     */
    public void testTime() {
        long begin = System.currentTimeMillis(); //测试起始时间
        testMethod(); //测试方法
        long end = System.currentTimeMillis(); //测试结束时间
        System.out.println("[use time]:" + (end - begin)); //打印使用时间
    }

    public static void main(String[] args) {
        RunningTime test = new RunningTime();
        test.testTime();
    }
}
