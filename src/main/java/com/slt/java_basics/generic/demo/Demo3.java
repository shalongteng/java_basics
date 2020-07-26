package com.slt.java_basics.generic.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符
 *  ？           任意类型，如果没有明确
 *  ？ extends E 向下限定，E及其子类
 *  ？ super E   向上限定，E及其父类
 *
 *  问题：为什么要有泛型通配符
 *      因为集合不能协变。但是数组可以协变。
 *
 *  base类是sub类的基类，那么base[]也是sub[]的基类
 */
public class Demo3 {

    public static void main(String[] args) {
        /**
         * 泛型通配符不是用在定义对象上，用在方法形参上。
         */
        List<?> list = new ArrayList<>();

        /**
         * 数组的协变,有点像多态，集合是不能协变的。
         */
        Person [] ps = new Person[2];
        ps[0] = new Person();
        ps[1] = new Person();
        method2(ps);

        Student[] ss = new Student[2];
        ss[0] = new Student();
        ss[1] = new Student();
        method2(ss);

        /**
         * 泛型通配符，就是解决 泛型不可协变问题
         *
         */

        ArrayList<Student> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        method3(list1);

    }

    /**
     * 通配符用在这里
     * @param arrayList
     */
    public static void method(ArrayList<?> arrayList){

    }
    public static void method3(ArrayList<? extends Person> arrayList){

    }

    /**
     * 数组的协变
     * @param ps
     */
    public static void method2(Person [] ps){
        for (Person p : ps) {
            System.out.println(p);
        }
    }
}


class Person{
    public void eat(){
        System.out.println("person eat");
    }
}

class Student extends Person{
    @Override
    public void eat(){
        System.out.println("student eat");
    }
}