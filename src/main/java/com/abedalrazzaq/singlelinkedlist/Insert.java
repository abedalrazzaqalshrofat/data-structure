package com.abedalrazzaq.singlelinkedlist;

public interface Insert<T extends Comparable<T>> {

    Node<T> insertAt(T t,Node<T> root);



}
