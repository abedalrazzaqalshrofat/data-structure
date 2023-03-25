package com.abedalrazzaq.doublylinkedlist;

import com.abedalrazzaq.singlelinkedlist.List;

public interface NavigableList<T extends Comparable<T>> extends List<T> {

    @Override
    void insert(T item);

    void insertAtFirst(T item);

    void insertAtLast(T item);

    void removeFromFirst();

    void removeFromLast();

}
