package me.study.programmers.levelone;

public class NaturalNumberFindSqrt {

    public static void main(String[] args) {
        NaturalNumberFindSqrt findSqrt = new NaturalNumberFindSqrt();
        long n = 4;
        long solution = findSqrt.solution(n);

    }

    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        int sqrtInt = (int) sqrt;

        if (sqrt - sqrtInt > 0) {
            return -1;
        }

        return (sqrtInt + 1) * (sqrtInt + 1);
    }
}
