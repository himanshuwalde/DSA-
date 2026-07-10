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
    class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        List<Integer> arr = new ArrayList<>();
        int currLevel = 0;
        while (!q.isEmpty()) {
            Pair front = q.poll();
            if (front.level != currLevel) {
                ans.add(new ArrayList<>(arr));   // Save previous level
                arr.clear();
                currLevel = front.level;
            }
            arr.add(front.node.val);
            if (front.node.left != null)
                q.offer(new Pair(front.node.left, front.level + 1));

            if (front.node.right != null)
                q.offer(new Pair(front.node.right, front.level + 1));
        }
        // Add the last level
        ans.add(new ArrayList<>(arr));
        return ans;
    }
}
