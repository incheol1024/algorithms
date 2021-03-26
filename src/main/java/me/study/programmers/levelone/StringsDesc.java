package me.study.programmers.levelone;

public class StringsDesc {

    public static void main(String[] args) {
        StringsDesc stringsDesc = new StringsDesc();
        String s = "Zbcdefg";
        String solution = stringsDesc.solution(s);
        System.out.println(solution);

        System.out.println((int) 'z');
        System.out.println((int) 'a');
        System.out.println((int) 'Z');
        System.out.println((int) 'A');
    }

    public String solution(String s) {
        String answer = "";
        char[] chars = bubbleSort(s.toCharArray(), s.length() - 1);
        answer = new String(chars);
        return answer;
    }

    private char[] bubbleSort(char[] chars, int lastIndex) {
        if (lastIndex == 0) {
            return chars;
        }

        for (int i = 0; i < lastIndex; i++) {
            if (chars[i] < chars[i + 1])
                swap(chars, i, i + 1);
        }

        return bubbleSort(chars, lastIndex - 1);
    }

    private void swap(char[] chars, int i1, int i2) {
        char temp = chars[i1];
        chars[i1] = chars[i2];
        chars[i2] = temp;
    }

}
