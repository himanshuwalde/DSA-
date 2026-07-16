/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isHeap(Node root) {
        int s = size(root);
        return isCBT(root, s, 1) && maxHeap(root);
    }
    public boolean isCBT(Node root, int size, int idx) {
        if(root == null){
            return true;
        }
        if(idx > size){
            return false;
        }
        return isCBT(root.left, size, 2*idx) && isCBT(root.right, size, 2*idx + 1);
        
    }
    public boolean maxHeap(Node root) {
        if(root == null){
            return true;
        }
        int leftVal = (root.left != null)? root.left.data : Integer.MIN_VALUE;
        int rightVal = (root.right != null)? root.right.data : Integer.MIN_VALUE;
        if(root.data <= leftVal || root.data <= rightVal){
            return false;
        }
        return maxHeap(root.left) && maxHeap(root.right);
    }
    public int size(Node root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
}
