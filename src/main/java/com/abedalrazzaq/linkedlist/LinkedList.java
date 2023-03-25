package com.abedalrazzaq.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;

    private int numberOfItems = 0;

    private Insert<T> inserter;

    public LinkedList(Insert<T> inserter){
        this.inserter = inserter;
    }

    public LinkedList(){
        this.inserter = null;
    }


    @Override
    public void insert(T item) {
        if (root == null){
            root = new Node<>(item);
            numberOfItems++;
        } else {
            root = inserter.insertAt(item,root);
        }
    }

    @Override
    public void remove(T item) {
        Node<T> temp = root;
        boolean detected = false;
        while (temp.getNext() != null){
            if (temp.getNext().getData().compareTo(item) == 0){
                Node<T> target = temp.getNext();
                temp.setNext(target.getNext());
                target = null;
                detected = true;
                return;
            }
            temp = temp.getNext();
        }
        if (detected) numberOfItems--;
    }

    @Override
    public void removeAt(int index) {
        Node<T> temp = root;
        while (index > 1){
            temp = temp.getNext();
            index--;
        }

        if (temp != null) {
            Node<T> target = temp.getNext();
            temp.setNext(target.getNext());
            target = null;
            numberOfItems--;
        }
    }

    @Override
    public void traverse() {
        Node<T> temp = root;
        while (temp != null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

//    private static class Node<T extends Comparable<T>> {
//
//        private T data;
//        private Node<T> next;
//
//        public Node(T data) {
//            this.data = data;
//        }
//
//        public T getData() {
//            return data;
//        }
//
//        public void setData(T data) {
//            this.data = data;
//        }
//
//        public Node<T> getNext() {
//            return next;
//        }
//
//        public void setNext(Node<T> next) {
//            this.next = next;
//        }
//
//        @Override
//        public String toString() {
//            return data.toString();
//        }
//    }

}
