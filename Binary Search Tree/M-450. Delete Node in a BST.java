/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left == null && root.right == null){    // Case 1 (Leaf Node)
                return null;
            }
            if(root.left == null){  // Case 2 (Node with 1 child)
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            if(root.left != null && root.right != null){    // Case 1 (Node with 2 child)
                TreeNode pred = root.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                root.left = deleteNode(root.left, pred.val);
                pred.left = root.left;
                pred.right = root.right;
                return pred;
            }
        }
        return root;
    }
}
