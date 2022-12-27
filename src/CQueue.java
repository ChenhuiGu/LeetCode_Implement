package src;

import java.util.LinkedList;

/**
 * @author chenhuigu
 */
public class CQueue {
    private LinkedList<Integer> stack1;
    private LinkedList<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.removeLast();
        }
        if(stack1.isEmpty()){
            return -1;
        }
        while (!stack1.isEmpty()){
            stack2.add(stack1.removeLast());
        }
        return stack2.removeLast();
    }
}
