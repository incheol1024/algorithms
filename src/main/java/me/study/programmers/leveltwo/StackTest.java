package me.study.programmers.leveltwo;

import java.util.PriorityQueue;

public class StackTest {

    public static void main(String[] args) {
        stackIndex();
    }

    public static void stackIndex() {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
