/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    static int sum;
    public static void transformTree(Node root) {
        sum = 0;
        revInorder(root);
    }
    public static void revInorder(Node root) {
        if(root == null){
            return;
        }
        revInorder(root.right);
        int val = root.data;
        root.data = sum;
        sum += val;
        revInorder(root.left);
    }
}
