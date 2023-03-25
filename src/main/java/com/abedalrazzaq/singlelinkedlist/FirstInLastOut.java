package com.abedalrazzaq.singlelinkedlist;

public class FirstInLastOut<T extends Comparable<T>>  implements Insert<T>{

    public FirstInLastOut(){
    }


    @Override
    public Node<T> insertAt(T item, Node<T> root) {
        Node<T> temp = new Node<>(item);
        temp.setNext(root);
        root = temp;
        return root;
    }


}