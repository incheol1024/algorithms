package me.study.programmers.levelone;

import java.util.Arrays;

public class Budget {

    public static void main(String[] args) {
        Budget bud = new Budget();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        int solution = bud.solution(d, budget);
        System.out.println(solution);
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int a : d) {
            if (budget - a < 0) {
                break;
            }
            answer++;
            budget = budget - a;
        }

        return answer;
    }

}
