#1.概述
    Collection是一个接口，子接口有
        List
        Set
    Collection是根接口，表示其他若干个接口的共性而出现的接口。
    
#2.增删改查
    新增
        boolean add(E e);
            单个添加
        boolean addAll(Collection<? extends E> c);
            批量添加
    修改
    查询
        boolean contains(Object o);
            单个查询是否包含
        boolean containsAll(Collection<?> c);
            批量查询是否全部包含
        Iterator<E> iterator();
            返回改集合迭代器
    删除
        boolean remove(Object o);
            单个删除
        boolean removeAll(Collection<?> c);
            批量删除
        void clear();
            清空容器，删除所有
        default boolean removeIf(Predicate<? super E> filter)
            根据条件删除
#3.stream流
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 0);
    } 
    default Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
    default Stream<E> parallelStream() {
            return StreamSupport.stream(spliterator(), true);
    }
    
#4.其他方法
    int size();
        集合包含元素个数
    boolean isEmpty();
        集合是否为空
    boolean retainAll(Collection<?> c);
        求交集