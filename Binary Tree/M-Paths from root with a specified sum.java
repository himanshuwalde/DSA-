/* A Tree node
class Node {
    int key;
    Node left, right;

    Node(int x) {
        left = right = null;
        key = x;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, sum, arr, ans);
        return ans;
    }
    public void dfs(Node root, int sum, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        arr.add(root.key);
        if(sum == root.key){
            ans.add(new ArrayList<>(arr));
        }
        if(root.left != null){
            dfs(root.left, sum - root.key, arr, ans);
        }
        if(root.right != null){
            dfs(root.right, sum - root.key, arr, ans);
        }
        arr.remove(arr.size() - 1);
    }
}
