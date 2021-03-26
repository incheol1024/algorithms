package me.study.programmers.levelone;

import java.util.Arrays;

public class RemoveMin {

    public static void main(String[] args) {
        RemoveMin removeMin = new RemoveMin();
//        int[] arr = {4,3,2,1};
        int[] arr = {10};
        int[] solution = removeMin.solution(arr);
        String s = Arrays.toString(solution);
        System.out.println(s);
    }

    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] result = {-1};
            return result;
        }

        int minValue = arr[0];
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        arr[minIndex] = -1;

        int[] result = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == -1)
                continue;
            result[index] = arr[i];
            index++;
        }

        return result;
    }
}
