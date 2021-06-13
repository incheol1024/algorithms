package me.study.kakao;

import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        int[] giftCards = {4, 5, 3, 2, 1};
        int[] wants = {2, 4, 4, 5, 1};
        int solution = question1.solution(giftCards, wants);
        System.out.println(solution);
    }

    public int solution(int[] giftCards, int[] wants) {
        int answer = giftCards.length;

        for (int i = 0; i < giftCards.length; i++) {
            int giftCard = giftCards[i];
            if (giftCard == wants[i]) {
                continue;
            }

            for (int j = 0; j < giftCards.length; j++) {
                if (i == j)
                    continue;

                if(giftCards[j] == wants[j]) { // 다른사람의 것을 확인했을때 그 사람은 안바꾸려고할떄
                    continue;
                }

                if(wants[i] == giftCards[j]) {
                    swap(giftCards, i, j);
                }
            }
        }

        for(int i = 0; i < giftCards.length; i++) {
            if(giftCards[i] == wants[i])
                answer--;
        }

        return answer;
    }

    public void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}
