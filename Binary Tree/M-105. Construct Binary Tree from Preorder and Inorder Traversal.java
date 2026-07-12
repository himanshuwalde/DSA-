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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(0, n-1, 0, n-1, preorder, inorder);
    }
    public TreeNode helper(int preLow, int preHigh, int inLow, int inHigh, int[] preorder, int[] inorder) {
        if(preLow > preHigh || inLow > inHigh){
            return null;
        }
        int val = preorder[preLow];
        TreeNode node = new TreeNode(val);
        int root = 0;
        for(int i=inLow; i<=inHigh; i++){
            if(inorder[i] == val){
                root = i;
                break;
            }
        }
        int count = root - inLow;
        node.left = helper(preLow+1, preLow+count, inLow, root-1, preorder, inorder);
        node.right = helper(preLow+count+1, preHigh, root+1, inHigh, preorder, inorder);
        return node;
    }
}
