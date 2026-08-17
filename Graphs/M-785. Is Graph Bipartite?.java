class Solution {
    public boolean isBipartite(int[][] edges) {
        int n = edges.length;
        char[] color = new char[n];
        for(int i=0; i<n; i++){
            color[i] = 'N';
        }
        for(int i=0; i<n; i++){
            if(color[i] == 'N'){
                if(!bfs(i, color, edges)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int src, char[] color, int[][] edges){
        color[src] = 'G';
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(q.size() > 0){
            int vertex = q.remove();
            for(int ele : edges[vertex]){
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
