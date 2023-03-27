package src;

/**
 * 二分法搜索左边界和右边界
 */
public class Search {
    public int search(int[] nums, int target) {
        return helper(nums,target) - helper(nums,target-1);
    }

    /**
     * 查找右边界
     * @param nums
     * @param target
     * @return
     */
    private int helper(int[] nums, int target) {
        int right = nums.length - 1, left = 0;
        while (right >= left) {
            int mid = left + (right - left) >> 1;
            if (target >= nums[mid]) {
                right = mid + 1;
            } else {
                left = mid - 1;
            }
        }
        return left;
    }
}
