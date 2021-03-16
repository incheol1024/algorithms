package me.study.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KthNumber {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNumber kthNumber = new KthNumber();
        int[] solution = kthNumber.solution(array, commands);


    }

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = {};
        int[] range = {};
        int commandResult = 0;
        List<Integer> list = new ArrayList<>();

        for(int[] command : commands) {
            range = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(range);
            commandResult = range[command[2] - 1];
            list.add(commandResult);
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }


}
