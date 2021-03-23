package me.study.programmers.leveltwo;

public class TargetNumber {

    public static void main(String[] args) {
        TargetNumber targetNumber = new TargetNumber();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int solution = targetNumber.solution(numbers, target);
        System.out.println(solution);
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        int current = numbers[0];
        int a = dfs(current, 1, numbers, target);
        int b = dfs(-current, 1, numbers, target);

        answer = a + b;
        return answer;
    }

    private int dfs(int prev, int index, int[] numbers, int target) {

        if (index >= numbers.length) {
            if (target == prev)
                return 1;
            return 0;
        }

        int cur1 = prev + numbers[index];
        int cur2 = prev - numbers[index];

        index++;
        int answer = 0;
        answer += dfs(cur1, index, numbers, target);
        answer += dfs(cur2, index, numbers, target);

        return answer;
    }


}
