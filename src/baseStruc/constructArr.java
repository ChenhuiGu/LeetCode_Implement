package src.baseStruc;

public class constructArr {
    public int[] constructArr(int[] a) {
        if(a == null || a.length == 0) return a;
        int[] left = new int[a.length];
        left[0] = 1;
        int tmp = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            left[i] *= tmp;
            tmp *= a[i + 1];
        }
        return left;
    }
}
