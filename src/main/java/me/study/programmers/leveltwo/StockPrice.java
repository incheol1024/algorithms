package me.study.programmers.leveltwo;

import java.util.Arrays;

public class StockPrice {

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        int[] prices = {1, 2, 3, 2, 3};
        int[] solution = stockPrice.solution(prices);
        String s = Arrays.toString(solution);
        System.out.println(s);
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
                for(int j = i +1; j < prices.length; j++ ) {
                    if(prices[i] > prices[j]) {
                        answer[i] = j - i;
                        break;
                    }
                    if(i != prices.length - 1 && j == prices.length - 1)
                        answer[i] = j - i;
                }
        }
        return answer;
    }

}
