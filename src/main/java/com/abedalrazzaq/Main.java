package com.abedalrazzaq;

import com.abedalrazzaq.doublylinkedlist.DoublyLinkedList;
import com.abedalrazzaq.singlelinkedlist.LinkedList;
import com.abedalrazzaq.singlelinkedlist.Node;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insert("hello");
        list.insert("world");
        list.insert("my");
        list.insert("name");
        list.insert("is");
        list.insert("abedalrazzaq");
        list.insert("hassan");

        list.traverseReverse();




    }
}