package com.abedalrazzaq;

import com.abedalrazzaq.linkedlist.FirstInFirstOut;
import com.abedalrazzaq.linkedlist.FirstInLastOut;
import com.abedalrazzaq.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>(new FirstInFirstOut<String>());

        stringLinkedList.insert("hello");
        stringLinkedList.insert("world");

        stringLinkedList.traverse();

    }
}