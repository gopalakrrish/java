package com.github.gopalakrrish.dsa.stack;

public class StackDemo {
    public static void main(String[] args) {
        demoStringReverser();
        demoArrayStack();
        demoBalancedExpression();
    }

    public static void demoStringReverser() {
        String str = "abcde";

        var reverser = new StringReverser();
        var str_reversed = reverser.reverse(str);
        System.out.println(str_reversed);
    }

    public static void demoArrayStack() {
        var arrayStack = new ArrayStack();
        arrayStack.push(10);
        arrayStack.push(20);
        System.out.println(arrayStack);
    }

    public static void demoBalancedExpression() {
        String str = "((1+2))<>";
        var exp = new BalancedExpressionV2();
        var result = exp.isBalanced(str);
        System.out.println(result);
    }

}