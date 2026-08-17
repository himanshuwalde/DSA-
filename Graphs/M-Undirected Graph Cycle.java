class Pair {
    int vertex;
    int parent;
    Pair(int vertex, int parent){
        this.vertex = vertex;
        this.parent = parent;
    }
}
class Solution {
    public boolean isCycle(int V, int[][] edges) {
        int n = edges.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj. add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){
                if(bfs(i, visited, adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bfs(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while(q.size() > 0){
            Pair front = q.remove();
            int vertex = front.vertex;
            int parent = front.parent;
            for(int ele : adj.get(vertex)){
                if(!visited[ele]){
                    q.add(new Pair(ele, vertex));
                    visited[ele] = true;
                }
                else if(ele != parent){
                    return true;
                }
            }
        }
        return false;
    }
}
