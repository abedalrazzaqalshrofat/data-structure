package com.abedalrazzaq.doublylinkedlist;

import com.abedalrazzaq.singlelinkedlist.FirstInLastOut;
import com.abedalrazzaq.singlelinkedlist.LinkedList;

public class DoublyLinkedList<T extends Comparable<T>> implements NavigableList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    @Override
    public void insert(T item) {
        if (head == null){
            head = new Node<>(item);
            tail = head;
            return;
        }
        insertAtLast(item);
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
        if (tail == null){
            insert(item);
            return;
        }
        Node<T> temp = new Node<>(item);
        temp.setPrevious(tail);
        tail.setNext(temp);
        tail = temp;
        size++;
    }

    public void traverseReverse(){
        Node<T> temp = tail;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getPrevious();
        }
    }


    @Override
    public void removeFromFirst() {
        Node<T> temp = head.getNext();
        head.setNext(null);
        temp.setPrevious(null);
        head = temp;
        size--;
    }

    @Override
    public void removeFromLast() {
        Node<T> temp = tail.getPrevious();
        tail.setPrevious(null);
        temp.setNext(null);
        head = temp;
        size--;
    }

    @Override
    public void remove(T item) {
        Node<T> temp = head;
        boolean detected = false;
        while (temp.getNext() != null){
            if (temp.getNext().getData().compareTo(item) == 0){
                Node<T> target = temp.getNext();
                target.getNext().setPrevious(temp);
                temp.setNext(target.getNext());
                target.setPrevious(null);
                target = null;
                detected = true;
                return;
            }
            temp = temp.getNext();
        }
        if (detected) size--;
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
