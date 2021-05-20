#1.概述
    迭代器模式
        每种容器遍历方式不同，所以每种容器返回自己的iterator，
        提供通用的遍历方法。
#1.方法
    boolean hasNext();
        是否还有下一个元素
    E next();
        返回下一个元素
    default void remove() {
         throw new UnsupportedOperationException("remove");
    }

    default void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            while (hasNext())
                action.accept(next());
    }