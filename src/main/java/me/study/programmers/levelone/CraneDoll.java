package me.study.programmers.levelone;

import java.util.Stack;

public class CraneDoll {

    public static void main(String[] args) {
        CraneDoll craneDoll = new CraneDoll();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves =  {1,5,3,5,1,2,1,4};
        int solution = craneDoll.solution(board, moves);
        System.out.println(solution);
    }

    Stack<Integer> movedDolls = new Stack<>();

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int dollNumber = 0;
        int move = 0;
        for(int i = 0; i < moves.length; i++) {
            move = moves[i] - 1;
            for(int j = 0; j < board[0].length; j++ ) {
                 dollNumber = board[j][move];
                 if(dollNumber != 0) {
                     answer = answer + moveDoll(dollNumber);
                     board[j][move] = 0;
                     break;
                 }
            }
        }

        return answer;
    }

    private int moveDoll(int dollNumber) {
        if (movedDolls.empty()) {
            movedDolls.push(dollNumber);
            return 0;
        }

        Integer peek = movedDolls.peek();
        if (peek.intValue() == dollNumber) {
            movedDolls.pop();
            return 2;
        }
        movedDolls.push(dollNumber);
        return 0;
    }
}
