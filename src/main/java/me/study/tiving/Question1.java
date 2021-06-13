package me.study.tiving;

public class Question1 {

    public static void main(String[] args) {
        Question1 question1 = new Question1();

        int[][] location = {{0, 3}, {1, 1}, {1, 5}, {2, 2}, {3, 3}, {4, 0}};
        int[] s = {1, 4};
        int[] e = {4, 1};
        int solution = question1.solution(location, s, e);
        System.out.println(solution);
    }

    public int solution(int[][] location, int[] s, int[] e) {
        int answer = 0;

        int xMin = Integer.min(s[0], e[0]);
        int xMax = Integer.max(s[0], e[0]);
        int yMin = Integer.min(s[1], e[1]);
        int yMax = Integer.max(s[1], e[1]);

        int x = 0;
        int y = 0;

        for (int i = 0; i < location.length; i++) {
            x = location[i][0];
            y = location[i][1];
            if (x >= xMin && x <= xMax) {
                if (y >= yMin && y <= yMax) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
