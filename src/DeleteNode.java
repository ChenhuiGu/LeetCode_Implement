package src;

/**
 * @author chenhuigu
 */
public class DeleteNode {
    public ListNode deleteNode01(ListNode head, int val) {
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        head = tmp;
        while (tmp.next != null){
            if(tmp.next.val == val){
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;
        }
        return head.next;
    }


    public ListNode deleteNode(ListNode head, int val) {
        if(head != null){
            if(head.val == val){
                return head.next;
            }
            head.next = deleteNode(head.next,val);
        }
        return head;
    }
}
