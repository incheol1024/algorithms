package me.study.encryption;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Encryption {

    public static String encryption(String originString) {
        originString = originString.replaceAll(" ", "");      // 공백 제거
        int stringLength = originString.length();
        int row = (int) Math.sqrt(stringLength);  // row, column 값 구하기
        int column =  row;

        if(row != Math.sqrt(stringLength)) // 루트값이 딱 떨어지지 않는 경우 컬럼에 + 1
            column++;

        if (stringLength > (row * column)) // 로우 * 컬럼이 문자열 길이보다 작아야 하는 제약 조건 확인
            ++row;

        return doEncryption(originString, column);
    }

    private static String doEncryption(String s, int column) {
        StringBuilder resultBuilder = new StringBuilder();
        int index = 0;

        for (int i = 0; i < column; i++) {
            index = i;
            for (int j = 0; index < s.length(); j++) {
                resultBuilder.append(s.charAt(index));
                index = index + column;
            }
            resultBuilder.append(" ");
        }
        return resultBuilder.toString().trim();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

//        String s = scanner.nextLine();

//        String s = "if man was meant to stay on the ground got would have given roots";
        String s = "iffactsdontfittotheorychangethefacts";

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
