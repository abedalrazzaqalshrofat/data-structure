package com.abedalrazzaq.linkedlist;

public class FirstInFirstOut<T extends Comparable<T>>  implements Insert<T>{


    @Override
    public Node<T> insertAt(T item,Node<T> root) {
        Node<T> temp = new Node<>(item);
        root.setNext(temp);
        return root;
    }

}
