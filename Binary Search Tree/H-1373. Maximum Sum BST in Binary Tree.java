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

class Quad {
    long max;
    long min;
    int sum;
    boolean isBST;
    Quad (long max, long min, int sum, boolean isBST){
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}
class Solution {
    int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }
    public Quad helper(TreeNode root) {
       if(root == null){ 
        return new Quad(Long.MIN_VALUE, Long.MAX_VALUE, 0, true);
       }
       Quad lst = helper(root.left);
       Quad rst = helper(root.right);
       long rootVal = root.val;
       long max = Math.max(rootVal, Math.max(lst.max, rst.max));
       long min = Math.min(rootVal, Math.min(lst.min, rst.min));
       int sum = root.val + lst.sum + rst.sum;
       boolean isBST = (lst.isBST) && (rst.isBST) && (lst.max < root.val) && (rst.min > root.val);
       if(isBST){
           maxSum = Math.max(sum, maxSum);
       }
       return new Quad(max, min, sum, isBST);
    }
}
