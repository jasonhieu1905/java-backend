package com.hieudoan.publictransport;

public class PublicTransport {

    public int solution(int[] input) {
        // If user go more than 23 days, return min
        if(input.length >= 23) {
            return 25;
        } else if(input.length <= 3) {
            return 2 * input.length;
        }
        int ans = Math.min(solve(input, 1, input[0]+6)+7, solve(input, 1, 0)+2);
        return Math.min(ans, 25);
    }

    public  int solve(int[] input, int index, int max) {
        if (index >= input.length) {
            return 0;
        }
        if (input[index] <= max) {
            return solve(input, index + 1, max);
        } else {
            return (Math.min(solve(input, index + 1, input[index] + 6) + 7, solve(input, index + 1, 0) + 2));
        }
    }
}
