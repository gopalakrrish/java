package com.github.gopalakrrish.dsa.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray numbers = new DynamicArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
//        numbers.insert(40);
        numbers.print();
        System.out.println(numbers);
        numbers.removeAt(2);
//        numbers.insert(100);
        numbers.print();
        System.out.println(numbers);
        System.out.println("index of 30 is " + numbers.indexOf(30));
    }

}