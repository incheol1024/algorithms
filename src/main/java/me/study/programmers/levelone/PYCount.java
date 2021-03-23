package me.study.programmers.levelone;

import java.util.Stack;

public class PYCount {

    public static void main(String[] args) {
        PYCount pyCount = new PYCount();
        String s = "Pyy";
        boolean solution = pyCount.solution(s);
        System.out.println(solution);
    }

    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        char[] chars = s.toCharArray();
        for(char ch : chars) {
            if(ch == 'p' || ch == 'P')
                pCount++;
            if(ch == 'y' || ch == 'Y')
                yCount++;
        }

        if(pCount == 0 || yCount == 0) {
            return false;
        }

        if(pCount == yCount)
            answer = true;
        else
            answer = false;

        return answer;
    }


}
