class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] pre : prerequisites){
            int course = pre[0];
            int prerequisite = pre[1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int[] arr = new int[numCourses];
        int idx = 0;
        while(q.size() > 0){
            int vertex = q.remove();
            arr[idx++] = vertex;
            for(int ele : adj.get(vertex)){
                indegree[ele]--;
                if(indegree[ele] == 0){
                    q.add(ele);
                }
            }
        }
        if(idx != numCourses){
            return new int[]{};
        }
        return arr;
    }
}
