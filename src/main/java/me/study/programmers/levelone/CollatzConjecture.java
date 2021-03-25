package me.study.programmers.levelone;

public class CollatzConjecture {

    public static void main(String[] args) {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        int solution = collatzConjecture.solution(626331);
        System.out.println(solution);
    }

    public int solution(int num) {
    return getCollatz(num, 0);
    }

    private int getCollatz(long num, int count) {
        if (num == 1) {
            return count;
        }
        if(count >= 500) {
            return -1;
        }

        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = num * 3 + 1;
        }
        return getCollatz(num, ++count);
    }

}
