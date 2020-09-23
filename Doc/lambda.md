#1、函数式编程
    1、函数式编程的特性
        将函数作为参数传递给另外一个函数
        一个函数可以作为另外一个函数的返回值
    2、无副作用
        函数的副作用指的是函数在调用过程中，除给出了返回值之外，还修改了函数外部的状态。
        函数式编程认为，函数的副用作应该被尽量避免
    3、声明式的（ Declarative)
        你要做的只是提出你的要求，声明你的用意即可。
    4、不变的对象
        不修改对象
    5、易于并行
#2、函数式编程基础
    1、Functionallnterface 函数式接口
        这个接口里面只能有一个抽象方法
            允许定义静态方法
            允许定义默认方法
            允许java.lang.Object中的public方法
    2、lambda 表达式
        lambda 表达式即匿名函数，它是一段没有函数名的函数体，【可以作为参数直接传递给相关的调用者】，lambda 表达式极大地增强了Java
        语言的表达能力。
    3、方法引用
        方法引用是 Java 8 中提出的用来简化 lambda 表达式的一种手段。它通过类名和方法名来定位一个静态方法或者实例方法。
        
        方法引用在 Java 8 中的使用非常灵活。总的来说，可以分为以下几种。
        · 静态方法引用 ： ClassName::methodName 
        · 实例上的 实例方法引用： instanceReference:: methodName 。
        ．超类上的实例方法引用 ： super::methodName 。
        · 类型上的实例方法引用 ： ClassName::methodName 。
        ．构造方法引用： Class::new 。
        · 数组构造方法引用 ： TypeName[]::new 。
#3、一步一步走入函数式编程
    Java 8 中对 lambda 表达式的处理几乎等 同 于匿名类的实现 ， 但是在写法上
    和编程范式上有了明显的区别 。
```java
public class Test{
    @Test
    public void test3(){
        int[] arr= { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Arrays.stream(arr) 返回一个IntStream 流对象
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        });

        // IntStream 接口名称被省略了
        Arrays.stream(arr).forEach((int value)-> System.out.println(value));
        //参数类型也是可以推导出来
        Arrays.stream(arr).forEach((value)-> System.out.println(value));
        //方法引用
        Arrays.stream(arr).forEach( System.out::println);
    }
}
```
