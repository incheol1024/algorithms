package me.study.programmers;

import java.util.ArrayList;
import java.util.List;

public class ArrayDivisor {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};

        List<Integer> list = new ArrayList<>();

        for (int a : arr) {
            if (a % divisor == 0)
                list.add(a);
        }

        if (list.size() == 0)
            return answer;

        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }


}
