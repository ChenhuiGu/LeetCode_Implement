package src;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head,end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end != null){
            pre = pre.next;
            end = end.next;
        }
        return pre;
    }
}
