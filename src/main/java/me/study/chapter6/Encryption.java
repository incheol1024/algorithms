package me.study.chapter6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Encryption {


    static String encryption(String s) {
        int rowNumber = (int)Math.sqrt(s.length());
        int columnNumber = rowNumber + 1;




        return "";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

//        String s = scanner.nextLine();

        String s = "haveaniceday";

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
