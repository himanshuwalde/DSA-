/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans, 0);
        return ans;
    }
    public void helper(Node root, ArrayList<Integer> ans, int level) {
        if(root == null){
            return;
        }
        if(level >= ans.size()){
            ans.add(root.data);
        }
        else{
            ans.set(level, root.data);
        }
        helper(root.right, ans, level+1);
        helper(root.left, ans, level+1);
    }
}
