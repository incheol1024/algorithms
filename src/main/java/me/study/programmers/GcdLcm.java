package me.study.programmers;

public class GcdLcm {

    public static void main(String[] args) {
        GcdLcm gcdLcm = new GcdLcm();
        int i = gcdLcm.calculateGcd(7, 6);
        System.out.println(i);
        int i1 = gcdLcm.calculateLcm(7, 6);
        System.out.println(i1);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = calculateGcd(n, m);
        answer[1] = calculateLcm(n, m);
        return answer;
    }

    private int calculateGcd(int n, int m) {
        int max = Integer.max(n, m);
        int min = Integer.min(n, m);
        int mod = 0;
        int result = 0;

        while(true) {
            mod = max%min;
            max = min;
            min = mod;
            if(mod == 0 ) {
                result = max;
                break;
            }
            if(mod == 1) {
                result = 1;
                break;
            }
        }

        return result;
    }

    private int calculateLcm(int n, int m) {
        return n*m /calculateGcd(n, m);
    }


}
