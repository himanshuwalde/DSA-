/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class Solution {
    public ListNode reverseDLL(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = pre;
            curr.prev = fwd;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
}
