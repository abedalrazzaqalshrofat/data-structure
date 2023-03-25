package com.abedalrazzaq.stack;

import com.abedalrazzaq.singlelinkedlist.Node;

public class StackList<T extends Comparable<T>> implements Stack<T> {

    private Node<T> next;

    private int size;

    public StackList(){

    }

    @Override
    public void push(T t) {
        Node<T> temp = new Node<>(t);
        temp.setNext(next);
        next = temp;
        size++;
    }

    @Override
    public T pop() {
        Node<T> temp = next;
        next = next.getNext();
        size--;
        return temp.getData();
    }

    @Override
    public T peek() {
        return new Node<>(next.getData()).getData();
    }

    @Override
    public void traverse() {
        Node<T> temp = next;
        while (temp != null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int size() {
        return size;
    }
}
