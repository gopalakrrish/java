package com.github.gopalakrrish.dsa.linkedlist;

import java.util.Arrays;


public class LinkedListDemo {
    public static void main(String[] args) {
//        singlyLinkedListDemo();
        doublyLinkedListDemo();

    }

    public static void singlyLinkedListDemo() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        System.out.println(list.contains(30));
//        list.removeLast();
//        System.out.println(list.contains(30));
//        System.out.println(list);
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        list.print();
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

    public static void doublyLinkedListDemo() {
        var list = new DoublyLinkedList();
        list.addFirst(20);
        list.addFirst(30);
        list.removeLast();
    }
}