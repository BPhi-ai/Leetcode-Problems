package LinkedLists;

import java.util.HashSet;

public class HasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next = head.next; //when pos = 1.
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<ListNode>();
        while(head != null) {
            if(s.contains(head)) {
                return true;
            }
            s.add(head);
            head = head.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}
