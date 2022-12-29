package src;

/**
 * @author chenhuigu
 */
public class CuttingRope {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int k = n % 3;
        int m = n / 3;
        if (k == 1) {
            return (int) (Math.pow(3, m - 1)) * 4;
        } else if (k == 2) {
            return (int) (Math.pow(3, m)) * 2;
        }
        return (int) Math.pow(3, m);
    }

    /**
     * 贪心算法，循环求余
     *
     * @param n
     * @return
     */
    public int cuttingRope02(int n) {
        if (n < 4) {
            return n - 1;
        }
        int p = (int) 1e9 + 7;
        // p * 3 int 越界
        long res = 1;
        while (n > 4) {
            res = res * 3 % p;
            n -= 3;
        }
        return (int) (res * n % p);
    }

    public static void main(String[] args) {
        CuttingRope rope = new CuttingRope();
        System.out.println(rope.cuttingRope02(10));
    }
}
