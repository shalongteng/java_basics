package com.slt.java_basics.reflect;
/**
　* @Description: 反射反射，程序员的快乐！
　* @author shalongteng
　* @date 2020/7/6 10:07
　*/
public class Reflect {

    /**
     * 获取Class对象的三种方式
     * 1 Object ——> getClass();
     * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
     * 3 通过Class类的静态方法：forName（String  className）(常用)
     *
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //1、通过对象调用 getClass() 方法来获取. 通常应用在：你传过来一个 Object
        //  类型的对象，而我不知道你具体是什么类，用这种方法
        Person person = new Person();
        Class<? extends Person> personClazz = person.getClass();
        System.out.println(personClazz);
        //2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
        //  这说明任何一个类都有一个隐含的静态成员变量 class
        Class<Person> personClass = Person.class;
        System.out.println(personClass == personClazz);
        //3、通过 Class 对象的 forName() 静态方法来获取，用的最多，
        //   但可能抛出 ClassNotFoundException 异常
        Class<?> forName = Class.forName("com.slt.java_basics.reflect.Person");
        System.out.println(forName == personClass);
    }

}
