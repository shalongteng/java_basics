#1.概述
    Predicate接口主要用来判断一个参数是否符合要求。
    是函数式接口，既只有一个抽象方法
#2.抽象方法
    boolean test(T t);
#2.默认方法
    既然是条件判断，就会存在与、或、非三种常见的逻辑关系
        default Predicate<T> and(Predicate<? super T> other)
        default Predicate<T> or(Predicate<? super T> other)
        default Predicate<T> negate()
        
    判等
        static <T> Predicate<T> isEqual(Object targetRef)
