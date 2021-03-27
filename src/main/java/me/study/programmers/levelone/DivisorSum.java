package me.study.programmers.levelone;

public class DivisorSum {

    public static void main(String[] args) {
        DivisorSum divisorSum = new DivisorSum();
        int n = 2;
        int solution = divisorSum.solution(n);
        System.out.println(solution);
    }

    public int solution(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int answer = 0;
        for(int i = 1; i*i < n; i++) {
            if(n%i == 0) {
                answer = answer + i + (n/i);
            }
        }
        return answer;
    }

}
