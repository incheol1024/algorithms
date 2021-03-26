package me.study.theory;

public class ArrayCombination {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        boolean[] visited = new boolean[arr.length];
        ArrayCombination arrayCombination = new ArrayCombination();
        arrayCombination.combination(arr, visited, 0 , 3);

    }

    void combination(int[] arr, boolean[] visited, int start,  int r) {
        if (r == 0) {
            print(arr, visited);
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, r - 1);
            visited[i] = false;
        }
    }

    private void print(int[] arr, boolean[] visited) {
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                System.out.print(arr[i]);
        }
    }
}
