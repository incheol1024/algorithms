package me.study.theory;

import java.util.Arrays;

public class ArrayPermutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] output = new int[3];
        boolean[] visited = new boolean[arr.length];

        perm(arr, output, visited, 0, arr.length, 3);
    }


    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
//                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;
            }
        }
    }

    private static void print(int[] output, int r) {
        System.out.println(Arrays.toString(output));
    }
}
