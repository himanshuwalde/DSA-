/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode insertBeforeHead(ListNode head, int data) {
        ListNode temp = new ListNode(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }
}
