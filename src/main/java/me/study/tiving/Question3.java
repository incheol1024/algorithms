package me.study.tiving;

public class Question3 {

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        int[] estimates = {5, 1, 9, 8, 10, 5};

        int k = 3;
        int solution = question3.solution(estimates, k);
        System.out.println(solution);
    }

    public int solution(int[] estimates, int k) {
        int answer = 0;
        int calculated = 0;

        for (int i = 0; i < estimates.length - k + 1; i++) {
            if (i == 0) {
                calculated = calculateUser(estimates, i, k);
            } else {
                calculated = calculated - estimates[i - 1] + estimates[i + k - 1];
            }

            if (answer < calculated)
                answer = calculated;
        }

        return answer;
    }

    private int calculateUser(int[] estimates, int start, int k) {
        int sumUser = 0;

        for (int i = start; i < start + k; i++) {
            sumUser += estimates[i];
        }

        return sumUser;
    }
}
