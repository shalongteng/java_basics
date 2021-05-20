package com.slt.java_basics.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 定义了多个Predicate，分别对应多个筛选条件
 * @return
 */
public class EmployeePredicates {
    /**
     * Predicate 函数式接口
     * 函数体就是 Predicate 的test实现
     * @return
     */
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultMale2() {
        return new Predicate<Employee>() {
            @Override
            public boolean test(Employee p) {
                return p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
            }
        };
    }
    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }
}  