package me.study.tiving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String[] args) {
        Question2 question2 = new Question2();
//        String[] card = {"ABACDEFG", "NOPQRSTU", "HIJKLKMM"};
        String[] card = {"AABBCCDD", "KKKKJJJJ", "MOMOMOMO"};
//        String[] word = {"GPQM", "GPMZ", "EFU", "MMNA"};
        String[] word = {"AAAKKKKKMMMMM","ABCDKJ"};
        String[] solution = question2.solution(card, word);
        System.out.println(Arrays.toString(solution));
    }

    public String[] solution(String[] card, String[] word) {
        String[] answer = {"-1"};
        String[] copiedCard = Arrays.copyOf(card, card.length);
        List<String> resultList = new ArrayList<>();

        boolean[] visited = new boolean[card.length];
        String[] wordChars = {};

        for (int i = 0; i < word.length; i++) {
            wordChars = word[i].split("");
            int wordIndex = 0;
            for (int j = 0; j < wordChars.length; j++) {
                if (!findString(card, wordChars[j], visited)) {
                    break;
                }
                wordIndex++;
            }

            if (wordIndex == wordChars.length) {
                if (isAllVisit(visited))
                    resultList.add(word[i]);
            }

            visited = new boolean[card.length];
            card = Arrays.copyOf(copiedCard, card.length);
        }

        if (resultList.size() == 0)
            return answer;

        answer = resultList.toArray(new String[0]);
        return answer;
    }

    private boolean isAllVisit(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i])
                return false;
        }
        return true;
    }

    private boolean findString(String[] card, String wordChar, boolean[] visited) {
        String cardStr = "";

        for (int i = 0; i < card.length; i++) {
            cardStr = card[i];
            if (cardStr.contains(wordChar)) {
                card[i] = cardStr.replaceFirst(wordChar, "");
                visited[i] = true;
                return true;
            }
        }

        return false;
    }

}
