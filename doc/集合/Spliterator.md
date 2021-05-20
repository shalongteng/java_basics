#1.概述
    可拆分迭代器，也用于遍历集合中的元素，但是他是为了并行设计的。
    通常和stream一起使用，用来遍历和分割序列。
#2.
    boolean tryAdvance(Consumer<? super T> action);
        如果元素存在对他进行处理，返回true，反之返回false
    Spliterator<T> trySplit();
        尝试对现有的stream进行分拆，一般用在parallelStream
        
    long estimateSize();
        表示Spliterator中待处理的元素，在trySplit前后一般是不同的。
    int characteristics();
        表示Spliterator的特征
        有八大特征：
        