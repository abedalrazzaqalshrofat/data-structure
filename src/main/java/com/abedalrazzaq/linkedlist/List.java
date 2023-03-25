package com.abedalrazzaq.linkedlist;

public interface List<T> {

    void insert(T item);

    void remove(T item);

    void removeAt(int index);

    void traverse();
}
