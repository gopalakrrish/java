package com.github.gopalakrrish.dsa.hashtable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HashTableDemo {
    public static void main(String[] args) {
        var finder = new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
        var ch2 = finder.findFirstRepeatedChar("a green apple");
        System.out.println(ch2);
    }
}