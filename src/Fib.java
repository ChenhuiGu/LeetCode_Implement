package src;

/**
 * @author chenhuigu
 */
public class Fib {
    public int fib(int n) {
        int a = 0,b = 1,sum = 1;
        for (int i = 2; i < n + 1; i++) {
            a = b;
            b = sum;
            sum = (a + b) % 1000000007;
        }
        return sum;
    }
}
