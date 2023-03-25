package com.abedalrazzaq.singlelinkedlist;

public class FirstInFirstOut<T extends Comparable<T>>  implements Insert<T>{

    private Node<T> tail;

    public FirstInFirstOut(){

    }

    @Override
    public Node<T> insert(T item,Node<T> root) {
        if (tail == null){
            tail = new Node<>(item);
            root.setNext(tail);
        }
        else {
            Node<T> temp = new Node<>(item);
            tail.setNext(temp);
            tail = temp;
        }
        return root;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
