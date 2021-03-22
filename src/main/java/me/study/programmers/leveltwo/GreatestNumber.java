package me.study.programmers.leveltwo;

import java.util.Arrays;

public class GreatestNumber {

    public static void main(String[] args) {
        GreatestNumber greatestNumber = new GreatestNumber();
        int[] numbers = {6, 10, 2};
        String solution = greatestNumber.solution(numbers);
        System.out.println(solution);
    }

    public String solution(int[] numbers) {
        return Arrays.stream(numbers).mapToObj(String::valueOf)
                .sorted(String::compareTo)
                .reduce(String::concat).get();
    }

}
