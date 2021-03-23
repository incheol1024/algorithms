package me.study.programmers.levelone;

public class StringsBasic {

    public static void main(String[] args) {
        StringsBasic stringsBasic = new StringsBasic();
        String s = "a234";
        boolean solution = stringsBasic.solution(s);
        System.out.println(solution);


    }

    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException formatException) {
                answer = false;
            }

            return answer;
        } else
            return false;
    }


}
