package me.study.programmers.leveltwo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] priorities = {2, 1, 2, 1, 2};
        int location = 1;
        int solution = printer.solution(priorities, location);
        System.out.println(solution);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priorityQueue = new PriorityQueue<>(priorities.length, (o1, o2) -> o2 - o1);
        Queue<Integer> indexQueue = new ArrayDeque<>(priorities.length);

        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.add(priorities[i]);
            indexQueue.add(i);
        }

        while (priorityQueue.size() > 0) {
            Integer index = indexQueue.poll();
            int priority = priorities[index];

            Integer peek = priorityQueue.peek();

            if (priority >= peek) {
                answer++;
                priorityQueue.remove();
                if (index == location)
                    return answer;
            } else {
                indexQueue.add(index);
            }

        }

        return answer;
    }

    private boolean hasLargerElement(int[] priorities, int priority) {
        for (int i = 0; i < priorities.length; i++) {
            if (priorities[i] > priority)
                return true;
        }

        return false;
    }


}
