package src;

public class MaxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = Math.max(dp[j - 1], dp[j]) + grid[i-1][j-1];
            }

        }
        return dp[n];
    }
}
