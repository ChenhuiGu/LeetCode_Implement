package src;

/**
 * @author chenhuigu
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (x == 0) {
            return x;
        }
        double res = 1.0;
        long b = n;
        if (n < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if (b % 2 == 1) {
                res *= x;
            }
            x *= x;
            b = b >> 1;
        }
        return res;
    }
}
