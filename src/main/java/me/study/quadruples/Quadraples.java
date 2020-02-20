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

        HashMap<String, Integer> firstMap = new HashMap<>(); //<Hash값, Xor값> a,b에 대한
        HashMap<String, Integer> secondMap = new HashMap<>(); //<Hash값, Xor값> a,b에 대한

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (firstMap.containsValue(i ^ j) && firstMap.containsKey(j + "" + i))
                    continue;

                firstMap.put(i + "" + j, i ^ j);
//                System.out.println((i + "" + j) + ":" + (i ^ j));
            }
        }

        System.out.println("=========");
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= d; j++) {
                if (secondMap.containsValue(i ^ j) && secondMap.containsKey(j + "" + i))
                    continue;

                secondMap.put(i + "" + j, i ^ j);
//                System.out.println((i + "" + j) + ":" + (i ^ j));
            }
        }


//        System.out.println(firstMap.size());
//        System.out.println(secondMap.size());

        HashSet<Integer> hashSet = new HashSet<>(5000);

        firstMap.entrySet().stream()
                .forEach(value -> {
                    secondMap.keySet().stream().forEach(s -> {
                        if (s.equals(value.getKey()) || secondMap.containsValue(value.getKey())) {
                        } else {
                            hashSet.add(Integer.valueOf(s) + Integer.valueOf(value.getKey()));
                        }
                    });
                });


        System.out.println(hashSet.size());
        return hashSet.size();
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

        int result = beautifulQuadruples(34, 35, 1, 50);

//        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
