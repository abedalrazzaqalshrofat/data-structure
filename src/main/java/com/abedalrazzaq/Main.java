package com.abedalrazzaq;

import com.abedalrazzaq.doublylinkedlist.DoublyLinkedList;
import com.abedalrazzaq.doublylinkedlist.NavigableList;
import com.abedalrazzaq.singlelinkedlist.FirstInFirstOut;
import com.abedalrazzaq.singlelinkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        NavigableList<String> stringLinkedList = new DoublyLinkedList<>();

        stringLinkedList.insert("hello");
        stringLinkedList.insert("world");
        stringLinkedList.insert("my");
        stringLinkedList.insert("name");


        stringLinkedList.remove("world");

        stringLinkedList.traverse();


    }
}