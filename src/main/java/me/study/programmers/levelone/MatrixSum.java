package me.study.programmers.levelone;

import java.util.Arrays;

public class MatrixSum {

    public static void main(String[] args) {
        MatrixSum matrixSum = new MatrixSum();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] solution = matrixSum.solution(arr1, arr2);

        String s = Arrays.deepToString(solution);
        System.out.println(s);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j <arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
