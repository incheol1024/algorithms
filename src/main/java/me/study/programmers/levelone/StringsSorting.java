package me.study.programmers.levelone;

import java.util.Arrays;

public class StringsSorting {


    public static void main(String[] args) {
        StringsSorting stringsSorting = new StringsSorting();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] solution = stringsSorting.solution(strings, n);
        System.out.println(Arrays.toString(solution));
    }


    // bubble sort
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = bubbleSort(strings, n, strings.length - 1);
        return answer;
    }

    private String[] bubbleSort(String[] strings, int n, int lastIndex) {
        if(lastIndex == 0) {
            return strings;
        }
        for (int i = 0; i < lastIndex; i++) {
            if (strings[i].charAt(n) > strings[i + 1].charAt(n)) {
                swap(strings, i, i + 1);
            }
            if(strings[i].charAt(n) == strings[i+1].charAt(n)) {
                if(strings[i].compareTo(strings[i+1]) < 0)
                    swap(strings, i, i+1);
            }

        }
        return bubbleSort(strings, n, lastIndex - 1);
    }

    private void swap(String[] strings, int i1, int i2) {
        String temp = strings[i1];
        strings[i1] = strings[i2];
        strings[i2] = temp;
    }


}
