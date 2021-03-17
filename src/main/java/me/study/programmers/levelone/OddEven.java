package me.study.programmers.levelone;

public class OddEven {

    public String solution(int num) {
        String answer = "Odd";

        if(num == 0) {
            return "Even";
        }

        if(num % 2 == 0) {
            return "Even";
        }

        return answer;
    }

}
