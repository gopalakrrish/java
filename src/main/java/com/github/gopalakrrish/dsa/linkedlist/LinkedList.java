package com.github.gopalakrrish.dsa.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        var current = first;
        int index = 0;
        while(current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first==last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;

        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first==last) {
            first = last = null;
            return;
        }

        last = getPrevious(last);
        last.next = null;

        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var index=0;
        var current = first;
        while (current!=null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    private Node getPrevious(Node node) {
        var current=first;
        while (current!=null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void reverse() {
        if(first==null) return;

        var previous = first;
        var current = first.next;
        while (current!=null){
            var following = current.next;
            current.next = previous;
            previous = current;
            current = following;
        }

        last=first;
        last.next=null;
        first=previous;

    }


    public void print() {
        System.out.println(first.value);
        System.out.println(last.value);
    }
}
