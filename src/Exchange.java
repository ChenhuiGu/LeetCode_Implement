package src;

/**
 * @author chenhuigu
 */
public class Exchange {
    public int[] exchange(int[] nums) {
        int right = 0, left = nums.length - 1, tmp;
        while (right < left) {
            while (right < left && (nums[right] & 1) == 1) {
                right++;
            }
            while (right < left && (nums[left] & 1) == 0) {
                left--;
            }
            tmp = nums[right];
            nums[right] = nums[left];
            nums[left] = tmp;
        }
        return nums;
    }


    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        int[] nums = new int[]{11, 9, 3, 7, 16, 4, 2, 0};
        exchange.exchange(nums);
    }
}
