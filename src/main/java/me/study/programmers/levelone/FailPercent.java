package me.study.programmers.levelone;

import java.util.Arrays;

public class FailPercent {

    public static void main(String[] args) {
        FailPercent failPercent = new FailPercent();
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] solution = failPercent.solution(n, stages);
        String s = Arrays.toString(solution);
        System.out.println(s);
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Stage[] stageArr = new Stage[N];

        double totalUser = 0;
        double failUser = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    if (stages[j] == i)
                        failUser++;
                    totalUser++;
                }
            }
            if(totalUser == 0)
                totalUser = 1;
            stageArr[i - 1] = new Stage(i, failUser / totalUser);
            totalUser = 0;
            failUser = 0;
        }

        Arrays.sort(stageArr, (o1, o2) -> {
            if (o1.failPercent > o2.failPercent)
                return -1;
            else if (o1.failPercent < o2.failPercent)
                return 1;

            if (o1.level > o2.level)
                return 1;

            if(o1.level < o2.level)
                return -1;

            return 0;
        });

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stageArr[i].level;
        }
        return answer;
    }

    static class Stage {
        private int level;
        private double failPercent;

        public Stage(int level, double failPercent) {
            this.level = level;
            this.failPercent = failPercent;
        }

        public int getLevel() {
            return level;
        }

        public double getFailPercent() {
            return failPercent;
        }

    }


}
