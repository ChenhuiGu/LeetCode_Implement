package src;

/**
 * @author chenhuigu
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            res += n & 1;
            // 无符号位移
            n = n>>>1;
            System.out.println(Integer.toBinaryString(n));
        }
        return res;
    }

    public int hammingWeight02(int n) {
        int res = 0;
        while (n != 0){
            res += 1;
            n = n & (n-1);
        }
        return res;
    }

    public static void main(String[] args) {
        HammingWeight hammingWeight = new HammingWeight();
        System.out.println(Integer.toBinaryString(-3));
        hammingWeight.hammingWeight(-3);
    }
}
