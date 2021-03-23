package me.study.programmers.levelone;

public class CaesarCipher {

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String s = "a B z";
        int n = 4;
        String solution = caesarCipher.solution(s, n);
        System.out.println(solution);

        System.out.println((int) 'a');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((int) ' ');// 32
    }

    public String solution(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 32)
                continue;
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) getValue(97, 122, chars[i] + n);
                continue;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) getValue(65, 90, chars[i] + n);
                continue;
            }

        }

        return new String(chars);
    }

    private int getValue(int min, int max, int value) {
        if(value <= max) {
            return value;
        }
        value = value - max + min - 1;
        return getValue(min, max, value);
    }

}
