package com.abedalrazzaq.doublylinkedlist;

public class DoublyLinkedList<T extends Comparable<T>> implements NavigableList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    @Override
    public void insert(T item) {
        insertAtFirst(item);
    }
    @Override
    public void insertAtFirst(T item){
        Node<T> temp = new Node<>(item);
        head.setPrevious(temp);
        temp.setNext(head);
        head = temp;
        size++;
    }
    @Override
    public void insertAtLast(T item){
        Node<T> temp = new Node<>(item);
        temp.setPrevious(tail);
        tail.setNext(temp);
        tail = temp;
        size++;
    }

    @Override
    public void removeFromFirst(T item) {
        Node<T> temp = head.getNext();
        head.setNext(null);
        temp.setPrevious(null);
        head = temp;
        size--;
    }

    @Override
    public void removeFromLast(T item) {
        Node<T> temp = tail.getPrevious();
        tail.setPrevious(null);
        temp.setNext(null);
        head = temp;
        size--;
    }

    @Override
    public void remove(T item) {
        removeFromLast(item);
    }

    @Override
    public void removeAt(int index) {
        Node<T> temp = head;
        while (index > 1){
            temp = temp.getNext();
            index--;
        }

        if (temp != null) {
            Node<T> target = temp.getNext();
            temp.setNext(target.getNext());
            target = null;
            size--;
        }
    }

    @Override
    public void traverse() {
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int size() {
        return size;
    }
}
