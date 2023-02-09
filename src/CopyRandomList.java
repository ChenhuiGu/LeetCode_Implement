package src;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class CopyRandomList {
    public Node copyRandomList01(Node head) {
        // 原节点与新节点映射关系
        Map<Node,Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null){
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }


    public Node copyRandomList(Node head){
        if(head == null) return null;
        Node curr = head;
        // 原地拼接  1 -> 1 -> 2 -> 2 -> 3 - > 3 -> null
        while (curr != null){
            Node tmp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = tmp;
            curr = curr.next.next;
        }
        // 链表的随机复制
        curr = head;
        while (curr != null){
            if(curr.random != null){
                // 随机新节点
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        // 拆分
        Node copyHead = head.next;
        curr = head;
        Node copyCurr = copyHead;
        while (curr != null){
           curr.next = curr.next.next;
           if(copyCurr.next != null){
               copyCurr.next = copyCurr.next.next;
               copyCurr = copyCurr.next;
           }
           curr = curr.next;

        }
        return copyHead;
    }
}
