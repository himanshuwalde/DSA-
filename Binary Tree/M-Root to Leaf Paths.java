/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr, ans);
        return ans;
    }
    public void helper(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if(root == null){
            return;
        }
        arr.add(root.data);
        if(root.left == null && root.right == null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        helper(root.left, arr, ans);
        helper(root.right, arr, ans);
        arr.remove(arr.size()-1);
    }
}
