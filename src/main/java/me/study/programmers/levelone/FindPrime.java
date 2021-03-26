package me.study.programmers.levelone;

public class FindPrime {

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        int n = 10;
        int solution = findPrime.solution(n);
        System.out.println(solution);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                answer++;
        }
        return answer;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
