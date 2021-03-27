package me.study.programmers.levelone;

public class DigitSum {

    public static void main(String[] args) {
        DigitSum digitSum = new DigitSum();
        int n = 123;
        int solution = digitSum.solution(n);
        System.out.println(solution);
    }

    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        for(char ch : chars)
            answer += ch - 48;
        return answer;
    }

}
