package me.study.programmers.leveltwo;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};
        int solution = hIndex.solution(citations);
        System.out.println(solution);
    }


    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if(citations[i] > citations.length - i)
                return i;
        }
        return answer;

    }
}
