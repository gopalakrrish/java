package com.github.gopalakrrish.dsa.hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        demoCharFinder();
    }

    public static void demoCharFinder() {
        var finder = new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
        var ch2 = finder.findFirstRepeatedChar("a green apple");
        System.out.println(ch2);
    }
}