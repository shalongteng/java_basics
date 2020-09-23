package com.slt.java_basics.syntacticSugar.function;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * lambda 表达式即匿名函数，它是一段没有函数名的函数体，【可以作为参数直接传递给相关的调用者】，lambda 表达式极大地增强了Java
 * 语言的表达能力。
 */
public class T02_lambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.forEach((Integer value) -> System.out.println(value));

        System.out.println("###################################");
        list.forEach(System.out::println);

        System.out.println("###################################");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    /**
     * 和匿名对象一样， lambda 表达式也可以访问外部的局部变量
     * lambda表达式 就是一个车匿名函数
     */
    @Test
    public void test1() {
        /**
         * num 不能修改，或者声明为final
         */
        int num = 2;
        Function<Integer, Integer> function = (from) -> from * num;
//        num++;
        System.out.println(function.apply(3));
    }

    /**
     * 方法引用
     * 静态方法 调用参数
     * 实例方法 调用目标
     */
    @Test
    public void test2() {
        List<User> userList = new ArrayList<User>();

        for (int i = 0; i < 10; i++) {
            userList.add(new User("用户" + i, i));
        }
        //map(User::getName) 在这里调用了每一个 User 对象的 getName方法，并将这些 User 的 name 作为一个新的流
        userList.stream().map(User::getName).forEach(System.out::println);
        userList.stream().forEach(System.out::println);

        BiFunction<String, Integer, User> aNew = User::new;

        System.out.println(aNew.apply("2", 2));
    }

    /**
     * Arrays.stream（）方法返回了 一个流对象 。 类似于集合或者数组
     * 表达式由“ －＞”分割，左半部分表示参数，右半部分表示实现体。
     */
    @Test
    public void test3() {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        // Arrays.stream(arr) 返回一个IntStream 流对象
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });

        // IntStream 接口名称被省略了
        Arrays.stream(arr).forEach((int value) -> System.out.println(value));
        //参数类型也是可以推导出来
        Arrays.stream(arr).forEach((value) -> System.out.println(value));
        //方法引用
        Arrays.stream(arr).forEach(System.out::println);
    }

    @Test
    public void test4() {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        IntConsumer outprintln = System.out::println;
        IntConsumer errprintln = System.out::println;

        Arrays.stream(arr).forEach(outprintln.andThen(errprintln));
    }


}
