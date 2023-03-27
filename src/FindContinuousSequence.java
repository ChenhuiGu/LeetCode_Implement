package src;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        // 左闭右开
        int i = 1, j = 1, sum = 0;
        List<int[]> res = new ArrayList<>();
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] arr = new int[j - i];
                for(int k=i;k<j;k++){
                    arr[k-i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
