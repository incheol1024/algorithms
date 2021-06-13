package me.study.devmatching;

import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        int row = 6;
        int column = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] solution = question2.solution(row, column, queries);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};

        int[][] rec = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            int startRowValue = i * columns + 1;
            for (int j = 0; j < columns; j++) {
                rec[i][j] = startRowValue + j;
            }
        }



        return answer;
    }
}
