package src;

/**
 * @author chenhuigu
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        head = reverseList(head.next);
        curr.next.next = curr;
        curr.next = null;
        return head;
    }
}
