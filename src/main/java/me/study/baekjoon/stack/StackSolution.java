package me.study.baekjoon.stack;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackSolution {

    int inputCount = 0;
    int inputNumber = 0;

    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StackSolution stackSolution = new StackSolution();
        while (scanner.hasNext()) {
            stackSolution.solution(scanner.next());
        }
    }

    public void solution(String input) {
        inputCount++;

        if (inputCount == 1) {
            inputNumber = Integer.parseInt(input);
            return;
        }

        if (input.startsWith("push")) {
            push(input);
        } else if (input.startsWith("pop")) {
            pop();
        } else if (input.startsWith("size")) {
            size();
        } else if (input.startsWith("empty")) {
            empty(input);
        } else if (input.startsWith("top")) {
            top(input);
        }

    }
    public void push(String input) {
        String[] s = input.split(" ");
        int i = Integer.parseInt(s[1]);
        stack.push(i);
    }

    public void pop() {
        try {
            Integer pop = stack.pop();
            System.out.println(pop);
        } catch (EmptyStackException e) {
            System.out.println(-1);
        }

    }

    private void size() {
        System.out.println(stack.size());
    }

    private void empty(String input) {
        System.out.println(stack.empty()? 1 : 0);
    }

    private void top(String input) {
        try {
            Integer peek = stack.peek();
            System.out.println(peek);
        } catch (EmptyStackException e) {
            System.out.println(-1);
        }
    }




}
