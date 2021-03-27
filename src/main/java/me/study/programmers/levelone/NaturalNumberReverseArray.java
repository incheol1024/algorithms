package me.study.programmers.levelone;

import java.util.Arrays;

public class NaturalNumberReverseArray {

    public static void main(String[] args) {
        NaturalNumberReverseArray array = new NaturalNumberReverseArray();
        long n = 12345;
        int[] solution = array.solution(n);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(long n) {
        String string = String.valueOf(n);
        int[] answer = new int[string.length()];

        char[] chars = string.toCharArray();
        int index = 0;
        for(int i = chars.length - 1; i >= 0; i--) {
            answer[index] = chars[i] - 48;
            index++;
        }

        return answer;
    }

}
