package src;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int num : nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() > nums.length >> 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public int majorityElement01(int[] nums) {
        int ans = 0, score = 0;
        for (int num : nums) {
            // 票数重置
            if (score == 0) ans = num;
            score += num == ans ? 1 : -1;
        }
        return ans;
    }

}
