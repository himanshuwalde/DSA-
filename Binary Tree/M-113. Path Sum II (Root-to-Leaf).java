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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        dfs(root, targetSum, arr, ans);
        return ans;
    }
    public void dfs(TreeNode root, int targetSum, List<Integer> arr, List<List<Integer>> ans) {
        if(root == null){
            return;
        }
        arr.add(root.val);
        if(root.left == null && root.right == null && targetSum == root.val){
            ans.add(new ArrayList<>(arr));
        }
        if(root.left != null){
            dfs(root.left, targetSum - root.val, arr, ans);
        }
        if(root.right != null){
            dfs(root.right, targetSum - root.val, arr, ans);
        }
        arr.remove(arr.size() - 1);
    }
}
