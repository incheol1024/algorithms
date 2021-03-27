package me.study.theory;

public class ArrayDfs {

    static int[] arr = {1, 2, 3};
    static boolean[] visited = new boolean[arr.length];
    static int[] result = new int[3];

    public static void main(String[] args) {
        printComb(arr, 0);
    }

    private static void printComb(int[] arr, int index) {

        if (arr.length == index) {
            for (int i = 0; i < 3; i++) {
                if(visited[i])
                    System.out.print(result[i]);
            }
            System.out.println();
        } else {
            visited[index] = true;
            result[index] = arr[index];
            printComb(arr, index + 1);
            visited[index] = false;
            printComb(arr, index + 1);
        }
    }
}
