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
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = null;
        flatten(left);
        flatten(right);
        root.right = left;
        TreeNode last = root;
        while(last.right != null){
            last = last.right;
        }
        last.right = right;
    }
}
// class Solution {
// public static void flatten(Node root) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     dfs(root,arr);
    //     for(int i=0;i<arr.size()-1;i++){
    //         Node a = arr.get(i);
    //         Node b = arr.get(i+1);
    //         a.right = b;
    //         a.left = null;
    //     }
    //     Node last = arr.get(arr.size()-1);
    //     last.left = null;
    //     last.right = null;
    // }

    // private static void dfs(Node root, ArrayList<Node> arr) {
    //     if(root==null) return;
    //     arr.add(root);
    //     dfs(root.left,arr);
    //     dfs(root.right,arr);
    // }
// }
