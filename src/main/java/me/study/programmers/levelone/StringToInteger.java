package me.study.programmers.levelone;

public class StringToInteger {

    public static void main(String[] args) {

        StringToInteger toInteger = new StringToInteger();
        String s = "-1234";
        int solution = toInteger.solution(s);
        System.out.println(solution);

    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

}
