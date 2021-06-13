package me.study.devmatching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question1 {

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] winNums = {31, 10, 45, 1, 6, 19};
        int[] solution = question1.solution(lottos, winNums);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int[] lottos, int[] winNums) {
        int[] answer = new int[2];
        Set<Integer> winSet = new HashSet<>();

        for (int num : winNums)
            winSet.add(num);

        int minValue = 0;
        int zeroValue = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (winSet.contains(lottos[i])) {
                minValue++;
                continue;
            }

            if (lottos[i] == 0)
                zeroValue++;
        }

        answer[0] = getRanking(minValue + zeroValue);
        answer[1] = getRanking(minValue);

        return answer;
    }


    private int getRanking(int num) {
        int result = 0;
        switch (num) {
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default:
                result = 6;
                break;
        }

        return result;
    }
}
