package me.study.programmers.leveltwo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        queueSize();
    }

    public static void queueSize() {

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.size());

        queue.add(1);
        System.out.println(queue.size());

        Integer poll = queue.poll();
        System.out.println(queue.size());

    }
}
