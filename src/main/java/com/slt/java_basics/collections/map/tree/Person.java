package com.slt.java_basics.collections.map.tree;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author shuang.kou
 * @createTime 2020年06月15日 17:02:00
 */
public class Person implements Comparable{
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Person o1 = (Person) o;
        return this.getAge().compareTo(o1.getAge());
    }

    public static void main(String[] args) {
        /**
         * 实现comparable 接口，否则TreeMap 会报错
         */
        TreeMap<Person, String> treeMap = new TreeMap<>();
        treeMap.put(new Person(3), "person1");
        treeMap.put(new Person(18), "person2");
        treeMap.put(new Person(35), "person3");
        treeMap.put(new Person(16), "person4");

        treeMap.entrySet().stream().forEach(personStringEntry -> {
            System.out.println(personStringEntry.getValue());
        });
        /**
         *
         */
        TreeMap<Person, String> treeMap2 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                int num = person1.getAge() - person2.getAge();
                return Integer.compare(num, 0);
            }
        });
    }


}
