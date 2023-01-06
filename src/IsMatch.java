package src;


/**
 * @author chenhuigu
 */
public class IsMatch {
    public boolean isMatch(String A, String B) {
        int n = A.length(), m = B.length();
        boolean[][] res = new boolean[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                // 匹配规则为空
                if (j == 0) {
                    res[i][j] = i == 0;
                } else {
                    // j-1为* 或 非*
                    if (B.charAt(j - 1) != '*') {
                        if (i > 0 && (A.charAt(i - 1) == B.charAt(j - 1) || B.charAt(j - 1) == '.')) {
                            res[i][j] = res[i - 1][j - 1];
                        }
                    } else {
                        //碰到 * 采取看或不看
                        if (j >= 2) {
                            res[i][j] |= res[i][j - 2];
                        }
                        if (i >= 1 && j >= 2 && (A.charAt(i - 1) == B.charAt(j - 2) || B.charAt(j - 2) == '.')) {
                            res[i][j] |= res[i - 1][j];
                        }
                    }
                }
            }
        }
        return res[n][m];
    }
}
