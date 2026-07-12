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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return helper(0, n-1, 0, n-1, inorder, postorder);
    }
    public TreeNode helper(int inLow, int inHigh, int postLow, int postHigh, int[] inorder, int[] postorder) {
        if(inLow > inHigh || postLow > postHigh){
            return null;
        }
        int val = postorder[postHigh];
        TreeNode node = new TreeNode(val);
        int root = 0;
        for(int i=inLow; i<=inHigh; i++){
            if(inorder[i] == val){
                root = i;
                break;
            }
        }
        int count = root - inLow;
        node.left = helper(inLow, root-1, postLow, postLow+count-1, inorder, postorder);
        node.right = helper(root+1, inHigh, postLow+count, postHigh-1, inorder, postorder);
        return node;
    }
}
