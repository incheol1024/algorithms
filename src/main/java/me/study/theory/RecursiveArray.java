package me.study.theory;

public class RecursiveArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

    }

    public void forRecursive(int [] arr) {

        for(int i = 0; i < arr.length; i++) {
          forRecursive(arr);
        }

    }
}
