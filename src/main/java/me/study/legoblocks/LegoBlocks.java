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

        // 중복 제거 수
        int duplicationNumber = (int) Math.pow(2, notVLine);


        if (m > 3) {
            duplicationNumber = duplicationNumber * (m-1);
            System.out.println(duplicationNumber);
        }

        int result = totalNumber - duplicationNumber + 1;

        System.out.println("===result===");
        System.out.println(result);

        return result;
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
        legoBlocks(4, 4);
    }
}
