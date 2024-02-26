package LinkedLists;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        ListNode result = removeNthFromEnd(head, n);
        Print(result);
    }  
 
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //having head being = {1,2,3,4,5}
        if(head == null || head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head; //{dummy, 1,2,3,4,5}
        int count = 0;

        ListNode iterate = head; //{1,2,3,4,5}
        while(iterate != null){
            count++;
            iterate = iterate.next;
        }      
        count-=n; //since n = 2, 5-2 = 3.
        ListNode prev = dummy; //{dummy, 1,2,3,4,5}
        for (int i = 0; i < count; i++) {
            prev = prev.next;
        } //when 3 iterations are done, 3 is prev, prev.next is 4, and prev.next.next is 5.
        prev.next = prev.next.next;
        return dummy.next; //{1,2,3,5}
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
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
