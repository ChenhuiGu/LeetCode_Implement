package src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return nums;
        // 双端队列，单调队列
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[n - k + 1];
        int index = 0;
        // 未形成区间,
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) deque.removeLast();
            deque.add(nums[i]);
        }
        // 第一个窗口
        res[index++] = deque.peekFirst();
        // 形成窗口
        for (int i = k; i < n; i++) {
            // 移出窗口的元素是否为最大值
            if(deque.peekFirst() == nums[i-k]) deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) deque.removeLast();
            deque.add(nums[i]);
            res[index++] = deque.peekFirst();
        }
        return res;


    }

}
