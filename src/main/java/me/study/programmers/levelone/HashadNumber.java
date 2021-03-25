package me.study.programmers.levelone;

public class HashadNumber {

    public static void main(String[] args) {
        HashadNumber hashadNumber = new HashadNumber();
        int x = 11	;
        boolean solution = hashadNumber.solution(x);
        System.out.println(solution);
    }

    public boolean solution(int x) {
        int sum = 0;
        int xx = x;
        while (x > 0) {
            sum += x%10;
            x = x/10;
        }

        return xx%sum == 0 ? true : false;
    }
}
