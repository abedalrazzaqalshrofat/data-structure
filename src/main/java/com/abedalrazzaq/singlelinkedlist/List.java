package com.abedalrazzaq.singlelinkedlist;

public interface List<T> {

    void insert(T item);

    void remove(T item);

    void removeAt(int index);

    void traverse();
}
