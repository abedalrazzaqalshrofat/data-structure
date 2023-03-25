package com.abedalrazzaq;

import com.abedalrazzaq.singlelinkedlist.FirstInFirstOut;
import com.abedalrazzaq.singlelinkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>(new FirstInFirstOut<String>());

        stringLinkedList.insert("hello");
        stringLinkedList.insert("world");

        stringLinkedList.traverse();

    }
}