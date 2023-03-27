package src;

public class LastRemaining {
    public int lastRemaining(int n, int m) {
        int index = 0;
        for (int i = 2; i < n; i++) {
            index = (index + m) % i;
        }
        return index;
    }
}
