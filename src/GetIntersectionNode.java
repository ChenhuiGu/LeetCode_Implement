package src;

public class GetIntersectionNode {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a1 = headA,b1 = headB;
        while (a1 != b1){
            a1 = a1 == null?headB:a1.next;
            b1 = b1 == null?headA:b1.next;
        }
        return a1;
    }
}
