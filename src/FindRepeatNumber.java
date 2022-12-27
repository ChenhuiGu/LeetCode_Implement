package src;

/**
 * @author chenhuigu
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int i= 0;
        while (i < nums.length-1){
            if(nums[i] == i){
                i++;
            }else {
                if(nums[nums[i]] == nums[i]){
                    return nums[i];
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        return 0;
    }
}
