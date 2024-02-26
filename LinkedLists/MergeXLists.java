package LinkedLists;

public class MergeXLists {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(4);
        headA.next.next = new ListNode(5);

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(3);
        headB.next.next = new ListNode(4);

        ListNode headC = new ListNode(2);
        headC.next = new ListNode(6);

        ListNode[] list = {headA, headB, headC};

        ListNode result = mergeKLists(list);
        Print(result);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
       if(lists.length == 0) {
            return null;
       }
       ListNode result = lists[0];
       for(int i = 1; i < lists.length; i++) {
          result = mergeTwoLists(result, lists[i]);
       }
       return result;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return pre.next;
    }

    public static void Print(ListNode head) {
        ListNode cur = head;
        System.out.print("[ ");
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.print("]");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
