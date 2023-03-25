package com.abedalrazzaq.doublylinkedlist;

public class Node<T extends Comparable<T>> extends com.abedalrazzaq.singlelinkedlist.Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> previous;

    public Node(T data) {
        super(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
