package me.study.programmers.levelone;

import java.util.HashMap;
import java.util.Map;

public class MarathonerWhoCouldNotFinish {

    public static void main(String[] args) {

        MarathonerWhoCouldNotFinish finish = new MarathonerWhoCouldNotFinish();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String solution = finish.solution(participant, completion);
        System.out.println(solution);
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> completionCache = new HashMap<>();

        for(String com : completion) {
            completionCache.merge(com, 1, Integer::sum);
        }

        for(String part : participant) {
            if(!completionCache.containsKey(part))
                return part;
            Integer integer = completionCache.get(part);
            if(integer == 0)
                return part;

            integer = integer - 1;
            completionCache.put(part, integer);
        }

        String answer = "";
        return answer;
    }


}
