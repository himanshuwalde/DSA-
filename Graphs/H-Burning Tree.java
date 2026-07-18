/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Pair {
    Node node;
    int dist;
    Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    Node start;
    HashMap<Node,Node> parent;
    public int minTime(Node root, int target) {
        start = null;
        parent = new HashMap<>();
        findParent(root, target);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, 0));
        HashSet<Node> burned = new HashSet<>();
        burned.add(start);
        int time = 0;
        while(q.size() > 0){
            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;
            time = Math.max(dist, time);
            if(node.left != null && !burned.contains(node.left)){
                q.add(new Pair(node.left, dist+1));
                burned.add(node.left);
            }
            if(node.right != null && !burned.contains(node.right)){
                q.add(new Pair(node.right, dist+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node), dist+1));
                burned.add(parent.get(node));
            }
        }
        return time;
    }
    public void findParent(Node root, int target){
        if(root == null){
            return;
        }
        if(root.data == target){
            start = root;
        }
        if(root.left != null){
            parent.put(root.left, root);
        }
        if(root.right != null){
            parent.put(root.right, root);
        }
        findParent(root.left, target);
        findParent(root.right, target);
    }
}
