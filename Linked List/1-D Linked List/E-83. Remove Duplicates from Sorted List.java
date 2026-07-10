/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2 != null){
           if(ptr1.val == ptr2.val){
            ptr2 = ptr2.next;
           }
           else{
            ptr1.next = ptr2;
            ptr1 = ptr2;
           }
        }
        ptr1.next = ptr2;
        return head;
    }
}
