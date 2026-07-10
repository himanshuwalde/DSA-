/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    boolean isPerfect(Node root) {
        int n = levels(root);
        double reqNodes = Math.pow(2, n) - 1;
        int count = countNodes(root);
        return (count == reqNodes);
    }
    int levels(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
