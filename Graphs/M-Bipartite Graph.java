class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        char[] color = new char[V];
        for(int i=0; i<V; i++){
            color[i] = 'N';
        }
        for(int i=0; i<V; i++){
            if(color[i] == 'N'){
                if(!bfs(i, color, adj)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int src, char[] color, ArrayList<ArrayList<Integer>> adj){
        color[src] = 'G';
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(q.size() > 0){
            int vertex = q.remove();
            for(int ele : adj.get(vertex)){
                if(color[ele] == 'N'){
                    q.add(ele);
                    if(color[vertex] == 'G'){
                        color[ele] = 'R';
                    }
                    else{
                        color[ele] = 'G';
                    }
                }
                else if(color[ele] == color[vertex]){
                    return false;
                }
            }
        }
        return true;
    }
}
