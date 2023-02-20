package src;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int res = nums[0],pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(pre > 0){
                pre += nums[i];
            }else {
                pre = nums[i];
            }
            res = Math.max(pre, res);
        }
        return res;
    }
}
