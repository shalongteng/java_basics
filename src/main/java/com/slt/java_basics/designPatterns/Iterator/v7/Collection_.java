package com.slt.java_basics.designPatterns.Iterator.v7;

public interface Collection_<E> {
    void add(E o);
    int size();

    Iterator_ iterator();
}
