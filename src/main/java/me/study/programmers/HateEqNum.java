package me.study.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateEqNum {

    public static void main(String[] args) {
        HateEqNum hateEqNum = new HateEqNum();
//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr = {1, 1, 2, 1};
        int[] solution = hateEqNum.solution(arr);

        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>(arr.length);

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1] != arr[i])
                list.add(arr[i-1]);

            if(i == arr.length - 1) {
                if(arr[i-1] == arr[i]){
                    list.add(arr[i-1]);
                } else {
                    list.add(arr[i]);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
