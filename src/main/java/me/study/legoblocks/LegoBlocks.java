package me.study.legoblocks;

import java.io.IOException;
import java.util.Scanner;

public class LegoBlocks {

    private static final Scanner scanner = new Scanner(System.in);

    static int legoBlocks(int n, int m) {  // n 행, m 열
        //짝대기 수
        int lineNumber = n * (m - 1);

        //총 경우의 수
        int totalNumber = (int) Math.pow(2, lineNumber);
        System.out.println(totalNumber);

        //버티컬 짝대기 하나를 제외한 짝대기 수
        int notVLine = lineNumber - n;

        double v = Math.pow(2, notVLine) * (m - 1); // 빼야됨
//        System.out.println("---: " + v);

        double v1 = Math.pow(2, n) * (m - 1);
//        System.out.println("+++: " + v1);
//        System.out.println(totalNumber - v + v1 - 1);

        return (int) (totalNumber - v + v1 - 1);
    }


    public static void main(String[] args) throws IOException {
/*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());
        legoBlocks(3,3);

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0].trim());

            int m = Integer.parseInt(nm[1].trim());

            int result = legoBlocks(n, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
*/
        legoBlocks(2, 3);
    }
}
