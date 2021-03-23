package me.study.programmers.levelone;

public class SeoulKim {

    public static void main(String[] args) {
        SeoulKim seoulKim = new SeoulKim();
        String[] strings =  {"Jane", "Kim"};
        String solution = seoulKim.solution(strings);
        System.out.println(solution);
    }

    public String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim"))
                answer = "김서방은 " + i + "에 있다";
        }

        return answer;
    }

}
