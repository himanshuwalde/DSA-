/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int findDist(Node root, int a, int b) {
        Node lca = lowestCommonAncestor(root, a, b);
        int[] arr = {0, 0};
        distance(lca, a, b, 0, arr);
        return arr[0] + arr[1];
    }
    public Node lowestCommonAncestor(Node root, int a, int b) {
        if(root == null){
            return null;
        }
        if(root.data == a || root.data == b){
            return root;
        }
        Node left = lowestCommonAncestor(root.left, a, b);
        Node right = lowestCommonAncestor(root.right, a, b);
        if(left != null && right != null){
            return root;
        }
        if(left == null){
            return right;
        }
        else{
            return left;
        }
    }
    public void distance(Node root, int a, int b, int depth, int[] arr){
        if(root == null){
            return;
        }
        if(root.data == a){
            arr[0] = depth; 
        }
        if(root.data == b){
            arr[1] = depth; 
        }
        distance(root.left, a, b, depth+1, arr);
        distance(root.right, a, b, depth+1, arr);
    }
}
