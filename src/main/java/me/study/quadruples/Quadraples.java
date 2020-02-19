package me.study.quadruples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Quadraples {


    /*
     * Complete the beautifulQuadruples function below.
     */
    static int beautifulQuadruples(int a, int b, int c, int d) {
        int[] ints = new int[]{a, b, c, d};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Collection<Integer> collection1 = new HashSet<>();
        Collection<Integer> collection3 = new HashSet<>();

        Collection<Integer> collection2 = new HashSet<>();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                collection1.add(i ^ j);
            }
        }

        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= d; j++) {
                collection2.add(i ^ j);
            }
        }

        long sum = collection1.stream()
                .mapToLong(integer -> {
                    return Long.valueOf(collection2.stream()
                            .filter(integer1 -> integer != integer1)
                            .peek(integer1 -> {
                                System.out.println(integer + " " + integer1);
                            })
                            .count());
                })
                .sum();

        System.out.println(sum);

        return 0;
    }

    private static int computeXOR(int[] integers) {
        int resultNumber = integers[0];

        for (int i = 1; i < integers.length; i++) {
            resultNumber = resultNumber ^ integers[i];
        }

        return resultNumber;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

//        String[] abcd = scanner.nextLine().split(" ");

//        int a = Integer.parseInt(abcd[0].trim());
//
//        int b = Integer.parseInt(abcd[1].trim());
//
//        int c = Integer.parseInt(abcd[2].trim());
//
//        int d = Integer.parseInt(abcd[3].trim());
//
//        int result = beautifulQuadruples(a, b, c, d);

        int result = beautifulQuadruples(1, 2, 3, 4);

//        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
