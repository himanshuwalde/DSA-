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

class Triplet {
    long max;
    long min;
    boolean isBST;
    Triplet (long max, long min, boolean isBST){
        this.max = max;
        this.min = min;
        this.isBST = isBST;
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root).isBST;
    }
    public Triplet helper(TreeNode root) {
       if(root == null){ 
        return new Triplet(Long.MIN_VALUE, Long.MAX_VALUE, true);
       }
       Triplet lst = helper(root.left);
       Triplet rst = helper(root.right);
       long rootVal = root.val;
       long max = Math.max(rootVal, Math.max(lst.max, rst.max));
       long min = Math.min(rootVal, Math.min(lst.min, rst.min));
       boolean isBST = (lst.isBST) && (rst.isBST) && (lst.max < root.val) && (rst.min > root.val);
       return new Triplet(max, min, isBST);
    }
}

// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         inorder(root, ans);
//         for(int i=0; i<ans.size()-1; i++){
//             if(ans.get(i) >= ans.get(i+1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void inorder(TreeNode root,  ArrayList<Integer> ans) {
//         if(root == null){
//             return;
//         }
//         inorder(root.left, ans);
//         ans.add(root.val);
//         inorder(root.right, ans);
//     }
// }
