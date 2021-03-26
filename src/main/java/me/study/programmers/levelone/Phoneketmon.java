package me.study.programmers.levelone;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {

    public static void main(String[] args) {
        Phoneketmon phoneketmon = new Phoneketmon();
        int[] nums = {3,3,3,2,2,4};
        int solution = phoneketmon.solution(nums);
        System.out.println(solution);
    }

    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        int maxAnswer = nums.length/2;

        for(int num : nums) {
            if(maxAnswer == set.size())
                return set.size();
            set.add(num);
        }

        answer = set.size();
        return answer;
    }

}
