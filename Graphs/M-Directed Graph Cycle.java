class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj =  new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(q.size() > 0){
            int vertex = q.remove();
            ans.add(vertex);
            for(int ele : adj.get(vertex)){
                indegree[ele]--;
                if(indegree[ele] == 0){
                    q.add(ele);
                }
            }
        }
        return ans.size() < V;  // if 'ans' size is less than no. of vertices(nodes) then the graph has no cycle.
        
    }
}
