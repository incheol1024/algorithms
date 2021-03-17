package me.study.programmers.levelone;

import java.util.*;

public class TwoNumberPlus {

    Set<Integer> cache = new HashSet<>();

    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(value -> value).sorted().toArray();
    }

    private boolean checkIfStored(int number) {
        return cache.contains(number);
    }

}
