package src;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author chenhuigu
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 *
 */
public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> min_stack;
    public MinStack() {
        stack = new ArrayDeque<>();
        min_stack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        int min = min_stack.peek();
        min_stack.push(val);

    }

    public void pop() {

    }

    public int top() {
        return 0;
    }

    public int getMin() {
        return min_stack.pop();
    }
}
