/* class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */

class Quad {
    long max;
    long min;
    int size;
    boolean isBST;
    Quad (long max, long min, int size, boolean isBST){
        this.max = max;
        this.min = min;
        this.size = size;
        this.isBST = isBST;
    }
}
class Solution {
    static int maxSize;
    static int largestBst(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }
    static Quad helper(Node root) {
       if(root == null){ 
        return new Quad(Long.MIN_VALUE, Long.MAX_VALUE, 0, true);
       }
       Quad lst = helper(root.left);
       Quad rst = helper(root.right);
       long rootVal = root.data;
       long max = Math.max(rootVal, Math.max(lst.max, rst.max));
       long min = Math.min(rootVal, Math.min(lst.min, rst.min));
       int size = 1 + lst.size + rst.size;
       boolean isBST = (lst.isBST) && (rst.isBST) && (lst.max < root.data) && (rst.min > root.data);
       if(isBST){
           maxSize = Math.max(size, maxSize);
       }
       return new Quad(max, min, size, isBST);
    }
}
