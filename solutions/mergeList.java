/**
 * Created by becky on 9/5/17.
 */
public class mergeList {
    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if(l1 == null) {
            prev.next = l2;
        } else {
            prev.next = l1;
        }

        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
