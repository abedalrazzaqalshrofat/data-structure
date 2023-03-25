package com.abedalrazzaq.singlelinkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;

    private int numberOfItems = 0;

    private final Insert<T> inserter;

    public LinkedList(Insert<T> inserter){
        this.inserter = inserter;
    }

    public LinkedList(){
        this.inserter = new FirstInFirstOut<>();
    }

    public void insert(T item,Insert<T> inserter) {
        if (root == null){
            root = new Node<>(item);
        } else {
            root = inserter.insert(item,root);
        }
        numberOfItems++;
    }


    @Override
    public void insert(T item) {
        if (root == null){
            root = new Node<>(item);
        } else {
            root = inserter.insert(item,root);
        }
        numberOfItems++;
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

    public Node<T> getAtIndex(int i){
        Node<T> temp = root;
        while (i >= 1){
            temp = temp.getNext();
            i--;
        }
        return new Node<>(temp.getData());
    }

    public void traverseReverse(){
       LinkedList<T> temp = new LinkedList<>();
       Node<T> node = root;
       while (node != null){
           temp.insert(node.getData(),new FirstInLastOut<>());
           node = node.getNext();
       }
       temp.traverse();
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

}
