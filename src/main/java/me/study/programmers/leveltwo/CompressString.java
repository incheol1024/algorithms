package me.study.programmers.leveltwo;

public class CompressString {

    public static void main(String[] args) {
        CompressString compressString = new CompressString();
        String s = "abcabcabcabcdededededede";
        int solution = compressString.solution(s);
        System.out.println(solution);
    }

    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        int compressedLength = 0;

        for (int i = 1; i <= s.length() / 2; i++) {
            compressedLength = compress(s, i);
            if (min > compressedLength)
                min = compressedLength;
        }

        return min < s.length() ? min : s.length();
    }

    private int compress(String str, int unit) {

        char[] chars = str.toCharArray();
        String before = "";
        String after = "";
        int equalCount = 1;
        String resultString = "";

        for (int i = 0; i < chars.length; i++) {

            if (i % unit == 0 && i != 0) { // 비교할 차례가 된다면
                // before, after 비교한다.
                if (before.equals(after)) { // 문자열 전,후가 같다면 equalCount를 올리고 after를 빈 문자열로 만든다.
                    equalCount++;
                } else { // 전, 후가 다르다면 저장된 equalCount와 Before를 결과 문자열에 추가 하고, 전에다가 후를 넣고 equalCount 초기화
                    resultString = resultString(equalCount, resultString, before);
                    before = after;
                    equalCount = 1;
                }
                after = "";
            }

            after += chars[i];

            if (i == chars.length - 1)
                break;
        }

        if (before.equals(after)) {
            equalCount++;
            resultString = resultString(equalCount, resultString, before);
        } else {
            resultString = resultString(equalCount, resultString, before + after);
        }

//        resultString = resultString.replace("1", "");

        return resultString.length();
    }

    private String resultString(int equalCount, String resultString, String add) {
        if (equalCount == 1)
            resultString += add;
        else
            resultString += equalCount + add;

        return resultString;
    }

    private boolean compareChars(char[] char1, char[] char2) {
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i])
                return false;
        }
        return true;
    }
}
