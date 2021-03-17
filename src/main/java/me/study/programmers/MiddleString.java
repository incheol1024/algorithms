package me.study.programmers;

public class MiddleString {

    public static void main(String[] args) {
        MiddleString middleString = new MiddleString();

        String s = "qwer";
        String solution = middleString.solution(s);
        System.out.println(solution);
    }

    public String solution(String s) {
        String answer = "";

        int index = 0;
        if ((s.length() % 2) != 0) {
            index = s.length() / 2;
            answer = s.substring(index, index + 1);
        } else {
            index = s.length() / 2 - 1;
            answer = s.substring(index, index + 2);
        }

        return answer;
    }

}
