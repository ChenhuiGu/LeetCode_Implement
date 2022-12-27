package src;


import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

/**
 * @author chenhuigu
 */
public class ReversePrint {

    ArrayList<Integer> queue = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recursion(head);
        int N = queue.size();
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = queue.get(i);
        }
        return res;
    }

    private void recursion(ListNode head){
        if(head == null) {
            return;
        }
        recursion(head.next);
        queue.add(head.val);
    }

}
