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
    int curr = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
    public void inorder(TreeNode root, int k) {
        if(root == null){
            return;
        }
        inorder(root.left, k);
        curr++;
        if(curr == k){
            ans = root.val;
            return;
        }
        inorder(root.right, k);
    }
}


// class Solution {
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         inorder(root, ans);
//         return ans.get(k-1);
//     }
//     public void inorder(TreeNode root, ArrayList<Integer> ans) {
//         if(root == null){
//             return;
//         }
//         inorder(root.left, ans);
//         ans.add(root.val);
//         inorder(root.right, ans);
//     }
// }
