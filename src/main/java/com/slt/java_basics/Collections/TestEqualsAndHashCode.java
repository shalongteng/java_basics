package com.slt.java_basics.Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * 为什么重写equals()方法要重写hashCode()方法
 */
public class TestEqualsAndHashCode {

    public static void main(String[] args) {
        Person person1 = new Person("slt");
        Person person2 = new Person("slt");


        HashMap<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(person1, 1);


        System.out.println(person1.equals(person2));
        /**
         * 他会根据 对象hashcode 算出的hash值 然后求得 数组下标，根据下标 去链表里查找是否存在
         *
         */
        System.out.println(hashMap.containsKey(person2));
        System.out.println(hashMap.get(person2));
    }

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Person) {
                Person person = (Person) obj;

                return name.equals(person.name);
            }
            return false;
        }
    }
}
