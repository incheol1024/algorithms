package me.study.programmers.levelone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathematicsAbandonment {

    public static void main(String[] args) {
        MathematicsAbandonment mathematicsAbandonment = new MathematicsAbandonment();
        int[] answers = {1, 2, 3, 4, 5};
        int[] solution = mathematicsAbandonment.solution(answers);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int[] answers) {
        int[] studentOne = {1, 2, 3, 4, 5};
        int[] studentTwo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] studentThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] studentAnswers = {0, 0, 0};
        int answer = 0;
        for (int i = 0; i < answers.length; i++) {
            answer = answers[i];
            if (answer == studentOne[i % studentOne.length]) {
                studentAnswers[0]++;
            }
            if (answer == studentTwo[i % studentTwo.length]) {
                studentAnswers[1]++;
            }
            if (answer == studentThree[i % studentThree.length]) {
                studentAnswers[2]++;
            }
        }

        int maxValue = 0;
        for (int i = 0; i < studentAnswers.length; i++) {
            if (studentAnswers[i] > maxValue)
                maxValue = studentAnswers[i];
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < studentAnswers.length; i++) {
            if (maxValue == studentAnswers[i])
                list.add(i + 1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
