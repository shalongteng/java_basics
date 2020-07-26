package com.slt.java_basics.designPatterns.Iterator.v5;

public interface Collection_ {
    void add(Object o);
    int size();

    Iterator_ iterator();
}
