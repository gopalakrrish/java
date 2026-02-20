package com.github.gopalakrrish.dsa.queue;

public class QueueDemo {
    public static void main(String[] args) {
        var queue = new PriorityQueue();
        queue.add(5);
        System.out.println(queue);
        queue.add(3);
        System.out.println(queue);
        queue.add(7);
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);
        queue.add(4);
        System.out.println(queue);
//        queue.add(10);
//        System.out.println(queue);

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
