package me.study.programmers.levelone;

import java.util.Arrays;

public class IntegerDesc {

    public static void main(String[] args) {
        IntegerDesc integerDesc = new IntegerDesc();
        long n = 118372;
        long solution = integerDesc.solution(n);
        System.out.println(solution);
    }

    public long solution(long n) {
        String string = String.valueOf(n);
        String[] split = string.split("");
        Arrays.sort(split, (s1, s2) -> -s1.compareTo(s2));

        StringBuilder stringBuilder = new StringBuilder();
        for(String s : split) {
            stringBuilder.append(s);
        }
        return Long.valueOf(stringBuilder.toString());
    }

}
