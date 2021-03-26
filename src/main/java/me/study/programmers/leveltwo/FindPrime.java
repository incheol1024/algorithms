package me.study.programmers.leveltwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPrime {

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        String numbers = "17";
        findPrime.solution(numbers);
    }

    public int solution(String numbers) {
        int answer = 0;
        char[] chars = numbers.toCharArray();
        int[] ints = new int[chars.length];
        for(int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - 48;
        }
        answer = findNumberOfPrime(ints);

        return answer;
    }

    Set<Integer> cache = new HashSet<>();
    private int findNumberOfPrime(int[] numbers) {
        int result = 0;
        boolean[] visited = new boolean[numbers.length];

        for(int i = 1; i <= numbers.length; i++) {
            result += dfs(numbers, new int[i], visited, i);
        }

        return result;
    }

    private int dfs(int[] numbers, int[] output, boolean[] visited, int cnt) {
        return 0;
    }

}
