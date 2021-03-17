package me.study.programmers.levelone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecommendId {



    public static void main(String[] args) {
//        String newId = "...!@BaT#*..y.abcdefghijklm";
        System.out.println((int) '0');
        System.out.println((int) '9');
        String newId = "123_.def";
        RecommendId recommendId = new RecommendId();
        String solution = recommendId.solution(newId);
        System.out.println(solution);
    }
    private Pattern pattern = Pattern.compile("[\\.][\\.]");
    private Pattern firstDotPattern = Pattern.compile("^[\\.]");
    private Pattern lastDotPattern = Pattern.compile("[\\.]$");
    private Pattern spacePattern = Pattern.compile("[\\s]");

    public String solution(String new_id) {
        String answer = recommendId(new_id);
        return answer;
    }

    private String recommendId(String id) {
        id = stepOne(id);
        System.out.println("=1=");
        System.out.println(id);
        id = stepTwo(id);
        System.out.println("=2=");
        System.out.println(id);
        id = stepThree(id);
        System.out.println("=3=");
        System.out.println(id);
        id = stepFour(id);
        System.out.println("=4=");
        System.out.println(id);
        id = stepFive(id);
        System.out.println("=5=");
        System.out.println(id);
        id = stepSix(id);
        System.out.println("=6=");
        System.out.println(id);
        return stepSeven(id);
    }


    private String stepOne(String id) {
        return id.toLowerCase();
    }

    private String stepTwo(String id) {
        char[] chars = id.toCharArray();
        for (int i = 0; i < chars.length; i++) { // step 2
            if (!isValidChar(chars[i])) {
                chars[i] = 65;
            }
        }

        String convertedStr = String.valueOf(chars);
        return convertedStr.replace("A", "");
    }

    private String stepThree(String id) {
        Matcher matcher = pattern.matcher(id);
        while (matcher.find()) {
            id = matcher.replaceFirst(".");
            matcher = pattern.matcher(id);
        }
        return id;
    }

    private String stepFour(String id) {
        Matcher firstDotMatcher = firstDotPattern.matcher(id);

        if (firstDotMatcher.find()) {
            id = firstDotMatcher.replaceFirst("");
        }

        Matcher lastDotMatcher = lastDotPattern.matcher(id);
        if (lastDotMatcher.find()) {
            id = lastDotMatcher.replaceFirst("");
        }

        return id;
    }


    private String stepFive(String id) {

        if(id.equals(""))
            id = "a";
        return id;
//        Matcher matcher = spacePattern.matcher(id);
//        while (matcher.find()) {
//            id = matcher.replaceFirst("a");
//            matcher = spacePattern.matcher(id);
//        }
//
//        return id;
    }

    private String stepSix(String id) {
        if (id.length() >= 16) {
            id = id.substring(0, 15);
        }
        Matcher matcher = lastDotPattern.matcher(id);
        if (matcher.find()) {
            id = matcher.replaceFirst("");
        }
        return id;
    }

    private String stepSeven(String id) {
        if (id.length() <= 2) {
            while (id.length() <= 2) {
                id = id + id.substring(id.length() - 1);
            }
        }

        return id;
    }

    private boolean isValidChar(char ch) {
        if (ch >= 97 && ch <= 122) // 소문자 여부 체크
            return true;

        if(ch >= 48 && ch <= 57) // 숫자 여부 체크
            return true;

        if (ch == 45 || ch == 95 || ch == 46) // - _ . 특수 문자 체크
            return true;

        return false;
    }


}
