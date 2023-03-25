package com.abedalrazzaq.singlelinkedlist;

public interface Insert<T extends Comparable<T>> {

    Node<T> insert(T t,Node<T> root);



}
