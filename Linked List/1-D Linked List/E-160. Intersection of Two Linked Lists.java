/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int countA = 0;
        while(temp != null){
            countA++;
            temp = temp.next;
        }
        temp = headB;
        int countB = 0; 
        while(temp != null){
            countB++;
            temp = temp.next;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        if(countA > countB){
            for(int i=1; i<=countA-countB; i++){
                tempA = tempA.next;
            }
        }
        if(countB > countA){
            for(int i=1; i<=countB-countA; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
