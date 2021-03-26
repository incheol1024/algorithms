package me.study.programmers.levelone;

public class SubakSubak {

    public static void main(String[] args) {
        SubakSubak subakSubak = new SubakSubak();
        int n = 4;
        String solution = subakSubak.solution(n);
        System.out.println(solution);
    }

    public String solution(int n) {
        String answer = "";

        for(int i = 0; i < n; i++) {
            if(i%2 == 0) {
                answer = answer.concat("수");
                continue;
            }
            answer = answer.concat("박");
        }

        return answer;
    }
}
