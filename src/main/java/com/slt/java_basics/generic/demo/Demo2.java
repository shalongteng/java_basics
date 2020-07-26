package com.slt.java_basics.generic.demo;


import lombok.Data;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;


/**
 * 泛型的种类：
 *  泛型类
 *  泛型接口
 *  泛型方法
 */
@Data
public class Demo2<T> {//T 形参

    T t;
    /**
     * 泛型方法是加在返回值前边的。
     */
    public <E> void test(E e){
        System.out.println(e);
    }


    public static void main(String[] args) {
        /**
         * 没有使用泛型，T相当于object
         */
        Demo2 demo2 = new Demo2();
        demo2.setT(1);
        Object demo2T = demo2.getT();

        demo2.test("hah");

        /**
         * 使用泛型
         */
        Demo2<String> demo21 = new Demo2<>();
        demo21.setT("ss");
    }
}

/**
 * 泛型接口
 * @param <T>
 */
interface Gen<T>{
    /**
     * 接口里都是常量，T的类型都不确定，没法赋值
     */
//    T t;
    /**
     * 接口里的都是常量，都是 public static final
     * 需要默认值
     */
    int t = 10;

    /**
     * 泛型放到参数或者返回值
     * @param t
     * @return
     */
    T method(T t);
}

/**
 * 如果接口没有明确泛型，实现类也需要加泛型
 */
class GenImpl<T> implements  Gen<T>{

    @Override
    public T method(T t) {
        return null;
    }
}

/**
 * 接口明确泛型
 */
class GenImpl2 implements  Gen<String>{

    @Override
    public String method(String s) {
        return null;
    }
}