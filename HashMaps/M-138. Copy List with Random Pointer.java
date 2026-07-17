/*
// Definition for a Node.
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
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copy = deepCopy(head);
        HashMap<Node, Node> map = new HashMap<>();
        map.put(null, null);
        Node tempA = head;
        Node tempB = copy;
        while(tempA != null){
            map.put(tempA, tempB);
            tempA = tempA.next;
            tempB = tempB.next;
        }
        tempA = head;
        while(tempA != null){
            map.get(tempA).random = map.get(tempA.random);
            tempA = tempA.next;
        }
        return copy;
    }
    public Node deepCopy(Node head1){
        Node dummy = new Node(-1);
        Node tempA = head1;
        Node tempB = dummy;
        while(tempA != null){
            Node t = new Node(tempA.val);
            tempB.next = t;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return dummy.next;
    }
}
