package src;

public class TranslateNum {
    public int translateNum(int num) {
        String nums = String.valueOf(num);
        int[] dp = new int[nums.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= nums.length(); i++) {
            String tmp = nums.substring(i - 2, i);
            dp[i] = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0
                    ? dp[i - 2] + dp[i - 1] : dp[i - 1];

        }
        return dp[nums.length()];
    }

    public int translateNum02(int num) {
        String nums = String.valueOf(num);
        // 使用变量
        int a = 1,b = 1;
        for (int i = 2; i <= nums.length(); i++) {
            String tmp = nums.substring(i - 2, i);
            int c = tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0
                    ? a + b : b;
            a = b;
            b = c;
        }
        return b;
    }
}
