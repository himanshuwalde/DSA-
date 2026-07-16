/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    static int idx;
    public static void convertToMaxHeapUtil(Node root) {
        idx = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        postOrder(root, ans);
    }
    public static void inOrder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        inOrder(root.left, ans);
        ans.add(root.data);
        inOrder(root.right, ans);
    }
    public static void postOrder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        root.data = ans.get(idx++);
    }
}
