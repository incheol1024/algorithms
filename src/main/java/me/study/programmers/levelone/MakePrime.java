package me.study.programmers.levelone;

public class MakePrime {

    private int answer = 0;

    public static void main(String[] args) {
        MakePrime makePrime = new MakePrime();
        int[] nums = {1, 2, 3, 4};
        int solution = makePrime.solution(nums);
        System.out.println(solution);
    }

    public int solution(int[] nums) {
        int answer = -1;
        boolean[] visited = new boolean[nums.length];
        int[] output = new int[3];

        combination(nums, output, visited, 0,0, 3);
        answer = this.answer;
        return answer;
    }

    private void combination(int[] nums, int[] output, boolean[] visited, int start, int depth, int r) {
        if (r == 0) {
            if (isPrime(sumArray(output))) {
                answer++;
                return;
            }
            return;
        }

        for(int i = start; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = nums[i];
                combination(nums, output, visited, i + 1, depth + 1, r - 1);
                visited[i] = false;
            }
        }

    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int sumArray(int[] nums) {
        int result = 0;
        for (int num : nums)
            result += num;

        return result;
    }

}
