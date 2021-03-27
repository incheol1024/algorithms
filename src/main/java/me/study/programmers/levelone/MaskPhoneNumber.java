package me.study.programmers.levelone;

public class MaskPhoneNumber {

    public static void main(String[] args) {
        MaskPhoneNumber maskPhoneNumber = new MaskPhoneNumber();
        String phoneNumber = "01033334444";
        String solution = maskPhoneNumber.solution(phoneNumber);
        System.out.println(solution);
    }

    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        char[] chars = phone_number.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(chars.length - i <= 4) {
                answer.append(chars[i]);
                continue;
            }
            answer.append("*");
        }

        return answer.toString();
    }
}
