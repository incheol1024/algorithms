package me.study.programmers.levelone;

import java.util.HashSet;
import java.util.Set;

public class GymSuit {

    public static void main(String[] args) {
        GymSuit gymSuit = new GymSuit();
        int n = 5;
        int[] lost = {1, 2, 3};
//        int[] lost = {2, 4};
        int[] reserve = {2, 3, 4};
//        int[] reserve = {3};

        int solution = gymSuit.solution(n, lost, reserve);
        System.out.println(solution);
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int r : reserve)
            set.add(r);

        Set<Integer> lostSet = new HashSet<>();
        for(int lo : lost) {
            lostSet.add(lo);
        }

        for(int i = 1; i < n+1; i++) {
            if(lostSet.contains(i)) { // 잃어버린애..
                if(set.remove(i-1) || set.remove(i+1))
                    answer++;
                continue;
            }

            answer++;
        }

        return answer;
    }


}
