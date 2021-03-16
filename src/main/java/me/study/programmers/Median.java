package me.study.programmers;

public class Median {

    public double solution(int[] arr) {
        double answer = 0;

        double total = 0d;
        for(int num : arr) {
            total += num;
        }

        answer = total/arr.length;
        return answer;
    }


}
