package me.study.programmers.levelone;

public class TernarySystem {

    public static void main(String[] args) {
        TernarySystem ternarySystem = new TernarySystem();
        int n = 45;
        int solution = ternarySystem.solution(n);
        System.out.println(solution);
    }

    public int solution(int n) {
        int answer = 0;
        String s = toTernaryReverseString(n);
        System.out.println(s);
        answer = Integer.parseInt(s, 3);
        return answer;

    }

    private String toTernaryReverseString(int n) {
        String result = "";
        while (n > 0) {
            result = result.concat(String.valueOf(n%3));
            n /= 3;
        }
        return result;
    }


}
