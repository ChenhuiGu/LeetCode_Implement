package src;

/**
 * @author chenhuigu
 */
public class PrintNumbers {
    int[] res;
    int count = 0;

    public int[] printNumbers(int n) {
        res = new int[(int) Math.pow(10, n) - 1];
        for (int digit = 1; digit < n + 1; digit++) {
            for (char first = '1'; first <= '9'; first++) {
                char[] nums = new char[digit];
                nums[0] = first;
                dfs(1,nums,digit);
            }
        }
        return res;
    }

    /**
     * @param index 当前位置
     * @param nums 字符数字
     * @param digit 字符长度
     */
    void dfs(int index,char[] nums,int digit){
        if(index == digit){
            // char[] -> String -> Integer
            res[count++] = Integer.parseInt(String.valueOf(nums));
            return;
        }
        for(char i='0';i<='9';i++){
            nums[index] = i;
            dfs(index+1,nums,digit);
        }
    }
}
