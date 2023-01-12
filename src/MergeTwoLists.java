package src;

/**
 * @author chenhuigu
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(-1);
        ListNode curr = tmp;
        while (l1 != null && l2 != null){
            if(l1.val >= l2.val){
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            curr = curr.next;
        }
        if(l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        return tmp.next;
    }
}
