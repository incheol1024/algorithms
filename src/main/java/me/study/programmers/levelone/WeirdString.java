package me.study.programmers.levelone;

import java.util.Arrays;

public class WeirdString {

    public static void main(String[] args) {
        WeirdString weirdString = new WeirdString();
//        String s = "try hello world";
        String s = "Hello   eVeryone asdf     asdf  ";
        String solution = weirdString.solution(s);
        System.out.println(solution);
    }

    public String solution(String s) {
//        String[] split = s.split("[\\s]+");
        String[] split = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();

        for (int j = 0; j < split.length; j++) {
            String[] wordSplit = split[j].split("");
            for (int i = 0; i < wordSplit.length; i++) {
                if (i % 2 == 0) {
                    answer.append(wordSplit[i].toUpperCase());
                    continue;
                }
                answer.append(wordSplit[i].toLowerCase());
            }

            if (split.length - 1 == j) {
                continue;
            }
                answer.append(" ");
        }

        return answer.toString();
    }

}
