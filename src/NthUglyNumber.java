package src;

public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int x2 = dp[a] * 2, x3 = dp[b] * 3, x5 = dp[c] * 5;
            dp[i] = Math.min(x2, Math.min(x3, x5));
            if(dp[i] == x2) a++;
            if(dp[i] == x3) b++;
            if(dp[i] == x5) c++;
        }
        return dp[n-1];
    }
}
