package me.study.kakao;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        int[][] needs = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int r = 2;
        int solution = question2.solution(needs, r);
        System.out.println(solution);
    }

    public int solution(int[][] needs, int r) {
        int answer = needs.length;
        int[] cntArr = new int[needs[0].length];

        for (int i = 0; i < needs.length; i++) {
            for (int j = 0; j < needs[i].length; j++) {
                if (needs[i][j] == 1) {
                    cntArr[j] += 1;
                }
            }
        }

        int[] indexes = new int[cntArr.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }

        sort(cntArr, 0, r, indexes);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < r; i++) {
            set.add(indexes[i]);
        }

        for (int i = 0; i < needs.length; i++) {
            for (int j = 0; j < needs[i].length; j++) {
                if (needs[i][j] == 1) {
                    if (!set.contains(j)) {
                        answer--;
                        break;
                    }
                }

            }
        }

        return answer;
    }

    public void sort(int[] arr, int start, int n, int[] indexes) {
        if (arr.length - 1 - start == n)
            return;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                swap(arr, i, i + 1);
                swap(indexes, i, i + 1);
            }
        }

    }

    public void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
