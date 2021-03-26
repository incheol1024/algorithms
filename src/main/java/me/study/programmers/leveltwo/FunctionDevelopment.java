package me.study.programmers.leveltwo;

import java.util.*;

public class FunctionDevelopment {

    public static void main(String[] args) {
        FunctionDevelopment functionDevelopment = new FunctionDevelopment();
//        int[] progresses = {99, 1, 99, 1};
        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 1, 1, 1};
        int[] speeds = {1, 30, 5};
        int[] solution = functionDevelopment.solution(progresses, speeds);
        String s = Arrays.toString(solution);
        System.out.println(s);
    }

    public int[] solution(int[] progresses, int[] speeds) {

        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

}
